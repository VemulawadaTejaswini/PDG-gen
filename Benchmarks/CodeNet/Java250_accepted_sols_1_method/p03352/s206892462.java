import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int ans = 1;

		for (int b = 1; b <= x; b++) {
			for (int p = 2; p < 1000; p++) {
				int pow = (int)Math.pow(b, p);
				if (pow <= x)
					if (ans < pow) ans = pow;
			}
		}
		System.out.println(ans);
	}
}