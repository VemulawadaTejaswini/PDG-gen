import java.util.Scanner;

class Dice {
	private int _t, _s, _e, _w, _n, _b;
	int getTop() {
		return _t;
	}
	void setTop(int t) {
		_t = t;
	}
	int getSouth() {
		return _s;
	}
	void setSouth(int s) {
		_s = s;
	}
	int getEast() {
		return _e;
	}
	void setEast(int e) {
		_e = e;
	}
	int getWest() {
		return _w;
	}
	void setWest(int w) {
		_w = w;
	}
	int getNorth() {
		return _n;
	}
	void setNorth(int n) {
		_n = n;
	}
	int getBottom() {
		return _b;
	}
	void setBottom(int b) {
		_b = b;
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
	void anchor_t_s(int t, int s) {
		if (t == _e) {
			rollZ(true);
		} else if (t == _w) {
			rollZ(false);
		} else {
			while (t != _t) {
				rollX(true);
			}
		}
		while (s != _s) {
			rollY(true);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dice d = new Dice();
		d.setTop(sc.nextInt());
		d.setSouth(sc.nextInt());
		d.setEast(sc.nextInt());
		d.setWest(sc.nextInt());
		d.setNorth(sc.nextInt());
		d.setBottom(sc.nextInt());
		sc.nextLine();
		int q = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < q; ++i) {
			int t = sc.nextInt(), s = sc.nextInt();
			sc.nextLine();
			d.anchor_t_s(t, s);
			System.out.println(d.getEast());
		}
		sc.close();
	}
}
