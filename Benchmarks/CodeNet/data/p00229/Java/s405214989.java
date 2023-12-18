import java.util.Scanner;


public class Main {

	static Scanner sc = new Scanner(System.in);
	static int b,r,g,c,s,t;
	public static void main(String[] args) {
		while(read())	solve();

	}

	private static void solve() {
		int dec = 2 * (b * 5 + r * 3) + (t - (b * 5 + r * 3)) * 3;
		int gain = g * 7 + c * 2 + s * 3 + (b * 5 + r * 3) * 15 + (b+r) * 15;
		System.out.println(gain+100-dec);

	}

	private static boolean read() {
		b = sc.nextInt();
		r = sc.nextInt();
		g = sc.nextInt();
		c = sc.nextInt();
		s = sc.nextInt();
		t = sc.nextInt();
		if (b == 0 && r == 0 && g == 0 && c == 0 && s == 0 && t == 0) {
			return false;
		} else {
			return true;
		}
	}

}