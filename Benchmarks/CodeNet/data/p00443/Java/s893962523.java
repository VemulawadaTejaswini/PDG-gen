import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Lightest Mobile
 */
public class Main {

	static Main main = new Main();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		Mobile mobile = null;
		while (!(line = br.readLine()).equals("0")) {
			int n = Integer.parseInt(line);

			mobile = main.new Mobile();
			for (int i = 1; i <= n; i++) {
				mobile.add(i, br.readLine());
			}
		}
		System.out.println(mobile.calc());
	}

	class Mobile {
		ArrayList<Bar> mobile = new ArrayList<Bar>();

		// 指定 id の棒をモービルに追加
		void add(int id, String info) {
			HangableImpr parent, left, right;
			int lid, rid;
			int rateL, rateR;

			StringTokenizer st = new StringTokenizer(info);
			rateL = Integer.parseInt(st.nextToken());
			rateR = Integer.parseInt(st.nextToken());

			// 親の棒
			if ((parent = find(id)) == null) {
				parent = new Bar(id, null);
			}
			((Bar) parent).lengthL = rateL;
			((Bar) parent).lengthR = rateR;

			lid = Integer.parseInt(st.nextToken());
			rid = Integer.parseInt(st.nextToken());

			// 左の棒
			if (lid == 0) {
				left = new Spindle();
				left.parent = parent;
			} else {
				if ((left = find(lid)) == null) {
					left = new Bar(lid, (Bar) parent);
				} else {
					((Bar) left).parent = (Bar) parent;
					mobile.remove(left);
				}
			}

			// 右の棒
			if (rid == 0) {
				right = new Spindle();
				right.parent = parent;
			} else {
				if ((right = find(rid)) == null) {
					right = new Bar(rid, (Bar) parent);
				} else {
					((Bar) right).parent = (Bar) parent;
					mobile.remove(right);
				}
			}
			((Bar) parent).left = left;
			((Bar) parent).right = right;
			if (((Bar) parent).parent == null) {
				mobile.add((Bar) parent);
			}
		}

		// 指定 id の棒を検索
		Bar find(int id) {
			Bar result = null;
			for (Bar b : mobile) {
				result = b.find(id);
				if (result != null)
					break;
			}
			return result;
		}

		int calc() {
			int result = 0;
			for (Bar b : mobile) {
				b.calc();
				result = b.weight;
			}
			return result;
		}
	}

	//
	interface Hangable {
		Hangable find(int id);
	}

	abstract class HangableImpr implements Hangable {
		HangableImpr parent;
		int weight = 0;
	}

	class Spindle extends HangableImpr {
		// int weight = 0;
		// Bar parent;

		Spindle() {
			this.weight = 0;
		}

		Spindle(int weight) {
			this.weight = weight;
		}

		public Spindle find(int id) {
			return null;
		}
	}

	class Bar extends HangableImpr {
		int id;
		int lengthL, lengthR;
		// Bar parent;
		HangableImpr parent, left, right;

		Bar(int id, Bar parent) {
			this.id = id;
			this.parent = parent;
		}

		public Bar find(int id) {
			Bar result = null;
			if (this.id == id)
				result = this;
			if (result == null && left != null)
				result = (Bar) left.find(id);
			if (result == null && right != null)
				result = (Bar) right.find(id);
			return result;
		}

		void calc() {
			if (left instanceof Bar) {
				((Bar) left).calc();
			}
			if (right instanceof Bar) {
				((Bar) right).calc();
			}

			int gcd = gcd(lengthL, lengthR);
			int tempL, tempR;
			int weightL, weightR;
			tempL = lengthL / gcd;
			tempR = lengthR / gcd;
			weightL = left.weight;
			weightR = right.weight;

			if (weightL == 0 && weightR == 0) {
				left.weight = tempR;
				right.weight = tempL;
			} else if (weightL != 0 && weightR == 0) {
				int lcm = lcm(tempR, lcm(tempL, weightL));
				right.weight = lcm / tempL;
			} else if (weightL == 0 && weightR != 0) {
				int lcm = lcm(tempL, lcm(tempR, weightR));
				left.weight = lcm / tempR;
			} else {
				int lcm = lcm(lcm(tempL, weightL), lcm(tempR, weightR));
				left.weight = lcm / tempR;
				right.weight = lcm / tempL;
			}
			weight = left.weight + right.weight;
		}
	}

	// 最大公約数
	static int lcm(int l, int r) {
		return l * r / gcd(l, r);
	}

	static int lcm(int l, int r, int gcd) {
		return l * r / gcd;
	}

	// 最小公倍数
	static int gcd(int l, int r) {
		int mod;
		int gt = l > r ? l : r;
		int lt = l < r ? l : r;

		do {
			mod = gt % lt;
			gt = lt;
			lt = mod;
		} while (mod != 0);

		return gt;
	}
}