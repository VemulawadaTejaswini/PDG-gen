import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	class Int {
		long[] mag;
		int sig = 0;
		long long_mask = -1L;
		long int_mask = long_mask >>> 32;
		long radix = int_mask + 1;
		int intLen = 0;

		public Int(int v) {
			intLen = v == 0 ? 0 : 1;
			mag = new long[] { (long) Math.abs(v) };
			sig = (int) Math.signum(v);
		}

		public Int(long v) {
			if (v == 0) {
				intLen = 0;
				sig = 0;
				mag = new long[] { 0 };
				return;
			}
			sig = (int) Math.signum(v);
			v = (long) (Math.abs(v));
			intLen = (v >= (1L << 32)) ? 2 : 1;
			mag = new long[] { int_mask & v, v >>> 32, };
		}

		// public Int(String str) {
		// if (str.equals("0")) {
		// mag = new long[] { 0 };
		// return;
		// }
		// if (str.charAt(str.length() - 1) == '-') {
		// sig = -1;
		// }

		// 1~999???2^10> ??????10?????????
		// 1000???10?????????
		// 2013?????§10?????????
		// 2^10>10^3
		// 2^(10/3)>10
		// 1?????? 2^(10/3)
		// 2?????? 2^(10/3)*2
		// long numBits = (str.length() * 10 + 2) / 3;
		// mag = new long[(int) numBits];
		// for (int i = 0; i < str.length(); ++i) {
		//
		// add(new Int(str.charAt(i) - '0'));
		// }
		// }

		void add(Int a) {
			if (a.sig == 0) {
				return;
			}
			if (sig * a.sig >= 0) {
				unsignedAdd(a);
				if (sig == 0) {
					sig = a.sig;
				}
			} else {
				Int u = a.copy();
				u.sig *= -1;
				sub(u);
			}
		}

		void sub(Int a) {
			if (a.sig == 0)
				return;
			if (sig != a.sig) {
				unsignedAdd(a);
				if (sig == 0) {
					sig = (-1) * a.sig;
				}
			} else {
				if (sig * compare(a) > 0) {
					unsignedSub(a);
				} else {
					Int t = a.copy();
					t.unsignedSub(this);
					sig *= -t.sig;
					mag = t.mag;
					intLen = t.intLen;
				}
			}
		}

		void unsignedAdd(Int a) {
			long res = 0;
			if (mag.length < a.mag.length) {
				mag = Arrays.copyOf(mag, a.mag.length);
			}
			intLen = Math.max(intLen, a.intLen);
			for (int i = 0; i < a.intLen; ++i) {
				long v = mag[i] + a.mag[i] + res;
				mag[i] = int_mask & v;
				res = v >>> 32;
			}
			for (int i = a.intLen; res != 0; ++i) {
				if (i >= mag.length) {
					mag = Arrays.copyOf(mag, 1 + mag.length);
				}
				long v = mag[i] + res;
				mag[i] = int_mask & v;
				res = v >>> 32;
				intLen = Math.max(intLen, i + 1);
			}
		}

		void unsignedSub(Int a) {
			if (sig == 0) {
				mag = Arrays.copyOf(a.mag, a.mag.length);
				sig = -1 * a.sig;
			}
			long res = 0;
			for (int i = 0; i < a.intLen; ++i) {
				long t = mag[i] - a.mag[i] - res;
				if (t < 0) {
					res = 1;
					t += radix;
				} else {
					res = 0;
				}
				mag[i] = t;
			}
			for (int i = a.intLen; res != 0; ++i) {
				long t = mag[i] - res;
				if (t < 0) {
					res = 1;
					t += radix;
				} else {
					res = 0;
				}
				mag[i] = t;
			}
			boolean f = false;
			for (int i = intLen - 1; i >= 0; --i) {
				if (mag[i] != 0) {
					intLen = i + 1;
					f = true;
					break;
				}
			}
			if (!f) {
				sig = 0;
				intLen = 0;
			}
		}

		int compare(Int a) {
			if (sig != a.sig) {
				return Integer.compare(sig, a.sig);
			}
			if (intLen != a.intLen) {
				return sig * Integer.compare(intLen, a.intLen);
			}
			for (int i = intLen - 1; i >= 0; --i) {
				if (mag[i] == a.mag[i])
					continue;
				return sig * Long.compare(mag[i], a.mag[i]);
			}
			return 0;
		}

		void singleMul(Int a) {
			if (intLen > 1 || a.intLen > 1) {
				throw new AssertionError();
			}
			if (a.sig == 0) {
				intLen = 0;
				sig = 0;
				mag = new long[] { 0 };
				return;
			}
			long prd = mag[0] * a.mag[0];
			mag[0] = int_mask & prd;
			long res = prd >>> 32;
			if (res > 0) {
				++intLen;
				mag = Arrays.copyOf(mag, 2);
				mag[1] = res;
			}
			sig *= a.sig;
		}

		// n^1.58
		void karatsuba(Int o) {
			int len_ = Math.max(intLen, o.intLen);
			if (len_ <= 1) {
				singleMul(o);
				return;
			}
			int Len = 1;
			while (Len < len_) {
				Len *= 2;
			}
			Int ret = new Int(0);
			Int a = copy(Len / 2, Len);
			Int b = copy(0, Len / 2);
			Int c = o.copy(Len / 2, Len);
			Int d = o.copy(0, Len / 2);
			Int X = a.copy();
			X.add(b);
			Int Y = c.copy();
			Y.add(d);
			X.karatsuba(Y);
			// (a*r+b)(c*r+d)
			// (a+b)(c+d)r-(ac+bd)r+acr^2+db
			// XYr -(Z+W)r+Zr^2+W;
			// a=0??????b=1 ??????
			X.shift(Len / 2);
			ret.add(X);
			Int Z = a.copy();
			Z.karatsuba(c);
			Int W = b.copy();
			W.karatsuba(d);
			ret.add(W);
			Int tmp = Z.copy();
			tmp.shift(Len);
			ret.add(tmp);
			Z.add(W);
			Z.shift(Len / 2);
			ret.sub(Z);
			this.sig = ret.sig;
			this.mag = Arrays.copyOf(ret.mag, ret.mag.length);
			this.intLen = ret.intLen;
		}

		void div(Int b) {
			Int a = copy();
			if (b.sig == 0)
				throw new ArithmeticException();
			int nextsig = sig * b.sig;
			sig = (int) (Math.abs(sig));
			b.sig = (int) (Math.abs(b.sig));
			if (compare(b) < 0) {
				sig = 0;
				mag = new long[] { 0 };
				intLen = 0;
				return;
			}
			Int M = new Int(1);
			Int X = new Int(1);
			M.shift(intLen + 1);
			Int pre = X.copy();
			while (true) {
				Int tmp = X.copy();
				tmp.karatsuba(X);
				tmp.karatsuba(b);
				tmp.shift(-M.intLen);
				X.add(X);
				X.sub(tmp);
				if (X.compare(pre) == 0) {
					break;
				}
				pre = X.copy();
			}
			X.karatsuba(this);
			X.shift(-M.intLen);
			{
				Int d = X.copy();
				d.karatsuba(b);
				if (a.compare(d) < 0) {
					X.sub(new Int(1));
				}
			}
			mag = X.mag;
			sig = nextsig;
			intLen = X.intLen;
		}

		// num<<k;
		void shift(int k) {
			if (sig == 0)
				return;
			if (intLen + k <= 0) {
				mag = new long[] { 0 };
				sig = 0;
				intLen = 0;
				return;
			}
			Int u = copy();
			mag = new long[intLen + k];
			if (k >= 0)
				System.arraycopy(u.mag, 0, mag, k, intLen);
			else
				System.arraycopy(u.mag, -k, mag, 0, intLen + k);
			intLen += k;
			// tr("shift", mag, intLen);
		}

		Int copy(int l, int r) {
			Int a = copy();
			a.mag = new long[r - l];
			r = Math.min(r, a.intLen);
			if (l >= r) {
				return new Int(0);
			}
			System.arraycopy(mag, l, a.mag, 0, r - l);
			a.intLen = r - l;
			return a;
		}

		Int copy() {
			Int ret = new Int(0);
			ret.sig = sig;
			ret.mag = Arrays.copyOf(mag, mag.length);
			ret.intLen = intLen;
			return ret;

		}

		void check() {
			// v=0->sig==0??????????????????
			boolean f = true;
			for (int i = 0; i < mag.length; ++i) {
				f &= mag[i] == 0;
			}
			if (f && sig != 0) {
				throw new AssertionError();
			}
			if (sig == 0)
				return;
			// intLen?????£????????????
			f = mag[intLen - 1] > 0;
			for (int i = mag.length - 1; i > intLen - 1; --i) {
				f &= mag[i] == 0;
			}
			if (!f) {
				throw new AssertionError();

			}
		}

		void mod(Int mod) {
			Int tmp = copy();
			tmp.div(mod);
			tmp.karatsuba(mod);
			sub(mod);
		}

		ArrayList<Int> rs = new ArrayList<>();
		// rs?????????????????´??????????????????????????????

		String toString(int radix) {
			if (sig == 0)
				return "0";
			rs.clear();
			Int r = new Int(radix);
			Int b = r.copy();
			int cnt = 0;
			rs.add(b.copy());
			// rs.get(i) = b^{2^i}
			// rs.back=b^{2^cnt} s.t b^{2^(cnt+1)}>=this
			while (true) {
				++cnt;
				b.karatsuba(b);
				rs.add(b.copy());
				Int tmp = b.copy();
				tmp.karatsuba(b);
				if (tmp.compare(this) >= 0) {
					break;
				}
			}
			String str = toString(radix, cnt);
			while (str.charAt(0) == '0') {
				str = str.substring(1, str.length());
			}
			if (sig == -1)
				str = "-" + str;
			return str;
		}

		String toString(int radix, int cnt) {
			if (intLen <= 1) {
				if (radix == 10) {
					String ret = String.valueOf(mag[0]);
					while (ret.length() < 1 << (cnt + 1)) {
						ret = "0" + ret;
					}
					return ret;
				} else if (radix == 2) {
					return Long.toBinaryString(mag[0]);
				} else {
					throw new AssertionError();
				}
			}
			// radix==10??¨???????¨??????????
			Int b = rs.get(cnt);
			Int u = copy();
			u.div(b);
			Int l = copy();
			u.rs = rs;
			String us = u.toString(radix, cnt - 1);
			while (us.length() < 1 << cnt) {
				us = "0" + us;
			}
			u.karatsuba(b);
			l.sub(u);
			// if (l.sig < 0) {
			// tr(l.mag);
			// throw new AssertionError();
			// }
			l.rs = rs;
			String ls = l.toString(radix, cnt - 1);
			while (ls.length() < 1 << cnt) {
				ls = "0" + ls;
			}
			return us + ls;
		}

		long toLong() {
			if (sig == 0) {
				return 0;
			}
			if (intLen == 1) {
				return sig * mag[0];
			}
			if (intLen == 2) {
				return sig * (mag[0] + (mag[1] << 32));
			}
			throw new AssertionError();
		}

		String toStringRadix2() {
			String ret = "";
			if (sig == 0)
				return "0";
			if (mag[intLen - 1] == 0)
				throw new AssertionError();
			for (int i = 0; i < intLen; ++i) {
				String s = Long.toBinaryString(mag[i]);
				while (s.length() < 32) {
					s = "0" + s;
				}
				ret = s + ret;
			}
			return ret;
		}
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			Int a = new Int(0);
			String t = sc.next();
			for (int i = 0; i < t.length(); ++i) {
				a.karatsuba(new Int(10));
				a.add(new Int(t.charAt(i) - '0'));
			}
			Int b = new Int(0);
			String s = sc.next();
			for (int i = 0; i < s.length(); ++i) {
				b.karatsuba(new Int(10));
				b.add(new Int(s.charAt(i) - '0'));
			}
			a.add(b);
			String ans = a.toString(10);
			if (ans.length() > 80) {
				System.out.println("overflow");
			} else {
				System.out.println(ans);
			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}