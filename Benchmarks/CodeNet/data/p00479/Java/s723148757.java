import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		for (int i = 0; i < k; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a > n / 2)
				a = n - a + 1;
			if (b > n / 2)
				b = n - b + 1;
			int c = Math.min(a, b) % 3;
			System.out.println(c == 0 ? 3 : c);
		}

	}
}