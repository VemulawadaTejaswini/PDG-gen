import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		for (int i = 0; i < 200; i++) {
			if (a % 2 != 0 || b % 2 != 0 || c % 2 != 0) {
				System.out.println(i);
				return;
			}
			int aa = (b + c) / 2;
			int bb = (c + a) / 2;
			int cc = (a + b) / 2;
			a = aa;
			b = bb;
			c = cc;
		}
		System.out.println(-1);
	}
}
