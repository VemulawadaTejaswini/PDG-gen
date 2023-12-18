import java.util.Arrays;
import java.util.Scanner;

class Dice {
	private int _t, _s, _e, _w, _n, _b;
	private int[] _p;
	Dice(int[] pip) {
		_t = pip[0];
		_s = pip[1];
		_e = pip[2];
		_w = pip[3];
		_n = pip[4];
		_b = pip[5];
		_p = pip.clone();
		Arrays.sort(_p);
	}
	void rollX(boolean d) {
		if (d) {
			int temp = _t;
			_t = _n;
			_n = _b;
			_b = _s;
			_s = temp;
		} else {
			int temp = _t;
			_t = _s;
			_s = _b;
			_b = _n;
			_n = temp;
		}
	}
	void rollY(boolean d) {
		if (d) {
			int temp = _s;
			_s = _w;
			_w = _n;
			_n = _e;
			_e = temp;
		} else {
			int temp = _s;
			_s = _e;
			_e = _n;
			_n = _w;
			_w = temp;
		}
	}
	void rollZ(boolean d) {
		if (d) {
			int temp = _e;
			_e = _b;
			_b = _w;
			_w = _t;
			_t = temp;
		} else {
			int temp = _e;
			_e = _t;
			_t = _w;
			_w = _b;
			_b = temp;
		}
	}
	void anchorTop(int t) {
		if (t == _e) {
			rollZ(true);
		} else if (t == _w) {
			rollZ(false);
		} else {
			while (t != _t) {
				rollX(true);
			}
		}
	}
	boolean equals(Dice d) {
		anchorTop(_p[0]);
		d.anchorTop(d._p[0]);
		boolean res = false;
		res |= _t == d._t && _s == d._s && _e == d._e && _w == d._w && _n == d._n && _b == d._b;
		rollY(true);
		res |= _t == d._t && _s == d._s && _e == d._e && _w == d._w && _n == d._n && _b == d._b;
		rollY(true);
		res |= _t == d._t && _s == d._s && _e == d._e && _w == d._w && _n == d._n && _b == d._b;
		rollY(true);
		res |= _t == d._t && _s == d._s && _e == d._e && _w == d._w && _n == d._n && _b == d._b;
		return res;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Dice[] d = new Dice[n];
		for (int i = 0; i < n; ++i) {
			int[] pip = new int[6];
			for (int j = 0; j < 6; ++j) {
				pip[j] = sc.nextInt();
			}
			sc.nextLine();
			d[i] = new Dice(pip);
		}
		for (int i = 0; i < n; ++i) {
			for (int j = i + 1; j < n; ++j) {
				if (d[i].equals(d[j])) {
					System.out.println("No");
					sc.close();
					return;
				}
			}
		}
		System.out.println("Yes");
		sc.close();
	}
}
