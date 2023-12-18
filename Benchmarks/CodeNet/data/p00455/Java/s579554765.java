import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		for (int i = 0; i < 3; ++i) {
			int h = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();
			int v1 = sec(h, m, s);
			h = sc.nextInt();
			m = sc.nextInt();
			s = sc.nextInt();
			int v2 = sec(h, m, s);
			int d = v2 - v1;
			System.out.print(d / 3600 + " ");
			d %= 3600;
			System.out.print(d / 60 + " ");
			d %= 60;
			System.out.println(d);
		}
	}

	static int sec(int h, int m, int s) {
		return h * 3600 + m * 60 + s;
	}

}