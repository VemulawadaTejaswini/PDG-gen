import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		String ans = "NO";

		if ((x - a) <= b && (x - a) >= 0) {
			ans = "YES";
		}

		System.out.println(ans);

		sc.close();
	}
}
