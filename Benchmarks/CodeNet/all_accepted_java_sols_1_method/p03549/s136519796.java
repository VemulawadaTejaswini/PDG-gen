import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ans = 1900 * (1 << m) * m + 100 * (1 << m) * (n - m);
		System.out.println(ans);
	}
}
