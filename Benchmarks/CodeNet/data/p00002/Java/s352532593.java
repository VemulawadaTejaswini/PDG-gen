import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int a,b;
			try {
				a = sc.nextInt();
				b = sc.nextInt();
			} catch (Exception e) {
				break;
			}

			int ans = a + b;

			String str = String.valueOf(ans);

			System.out.println(str.length());

		}

	}
}

