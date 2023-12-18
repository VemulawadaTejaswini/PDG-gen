import java.util.Scanner;

class dice {
	private int _u, _s, _e, _w, _n, _d;
	dice(int[] a) {
		_u = a[0];
		_s = a[1];
		_e = a[2];
		_w = a[3];
		_n = a[4];
		_d = a[5];
	}
	void roll(char o) {
		int temp;
		switch (o) {
			case 'E' :
				temp = _e;
				_e = _u;
				_u = _w;
				_w = _d;
				_d = temp;
				break;
			case 'N' :
				temp = _n;
				_n = _u;
				_u = _s;
				_s = _d;
				_d = temp;
				break;
			case 'S' :
				temp = _s;
				_s = _u;
				_u = _n;
				_n = _d;
				_d = temp;
				break;
			case 'W' :
				temp = _w;
				_w = _u;
				_u = _e;
				_e = _d;
				_d = temp;
				break;
		}
	}
	int top() {
		return _u;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[6];
		for (int i = 0; i < 6; ++i) {
			num[i] = sc.nextInt();
		}
		sc.nextLine();
		dice d = new dice(num);
		String str = sc.nextLine();
		for (int i = 0; i < str.length(); ++i) {
			d.roll(str.charAt(i));
		}
		System.out.println(d.top());
	}
}
