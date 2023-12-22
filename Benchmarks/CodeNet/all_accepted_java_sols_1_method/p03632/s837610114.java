import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
		int ans = Math.min(b, d) - Math.max(a, c);
		System.out.println(ans > 0 ? ans : 0);

		sc.close();
	}
}
