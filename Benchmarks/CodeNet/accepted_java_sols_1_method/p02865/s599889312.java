import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a, b;
		int m = 0;

		for (int i = 1; i <= n / 2; i++) {
			a = i;
			b = n - a;
			if (a == b) continue;
			//System.out.println(a + " " + b);
			m++;
		}

		System.out.println(m);
	}
}
