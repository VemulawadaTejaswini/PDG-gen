import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			Dice d = new Dice();
			int ans = 1;
			for (int i = 0; i < n; i++) {
				Method m = d.getClass().getMethod(sc.next());
				d = (Dice) m.invoke(d);
				ans += d.top;
			}
			System.out.println(ans);
		}
	}
}

class Dice {
	public int top;
	public int bottom;
	public int east;
	public int west;
	public int south;
	public int north;

	Dice() {
		top = 1;
		south = 2;
		east = 3;
		bottom = 7 - top;
		west = 7 - east;
		north = 7 - south;
	}

	Dice(int t, int s, int e) {
		top = t;
		south = s;
		east = e;
		bottom = 7 - top;
		west = 7 - east;
		north = 7 - south;
	}

	public Dice North() {
		int tmp = south;
		south = bottom;
		top = tmp;
		return new Dice(top, south, east);
	}

	public Dice East() {
		int tmp = west;
		east = top;
		top = tmp;
		return new Dice(top, south, east);
	}

	public Dice West() {
		int tmp = east;
		east = bottom;
		top = tmp;
		return new Dice(top, south, east);
	}

	public Dice South() {
		int tmp = north;
		south = top;
		top = tmp;
		return new Dice(top, south, east);
	}

	public Dice Right() {
		int tmp = east;
		east = north;
		south = tmp;
		return new Dice(top, south, east);
	}

	public Dice Left() {
		int tmp = south;
		south = west;
		east = tmp;
		return new Dice(top, south, east);
	}

	public String toString() {
		return "east:" + east + "west:" + west + "top:" + top + "bottom:"
				+ bottom + "north:" + north + "south:" + south;
	}
}