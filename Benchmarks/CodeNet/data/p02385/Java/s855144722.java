import java.util.Arrays;
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
		Dice[] d = {new Dice(), new Dice()};
		int[][] nums = {new int[6], new int[6]};
		for (int i = 0; i < 2; ++i) {
			for (int j = 0; j < 6; ++j) {
				nums[i][j] = sc.nextInt();
			}
			sc.nextLine();
			d[i].setTop(nums[i][0]);
			d[i].setSouth(nums[i][1]);
			d[i].setEast(nums[i][2]);
			d[i].setWest(nums[i][3]);
			d[i].setNorth(nums[i][4]);
			d[i].setBottom(nums[i][5]);
		}
		Arrays.sort(nums[0]);
		Arrays.sort(nums[1]);
		for (int i = 0; i < 6; ++i) {
			if (nums[0][i] != nums[1][i]) {
				System.out.println("No");
				sc.close();
				return;
			}
		}
		for (int i = 0; i < 2; ++i) {
			d[i].anchor_t_s(nums[i][0], nums[i][1]);
		}
		System.out.println(d[0].getTop() == d[1].getTop() && d[0].getSouth() == d[1].getSouth() && d[0].getEast() == d[1].getEast() && d[0].getWest() == d[1].getWest() && d[0].getNorth() == d[1].getNorth() && d[0].getBottom() == d[1].getBottom() ? "Yes" : "No");
		sc.close();
	}
}
