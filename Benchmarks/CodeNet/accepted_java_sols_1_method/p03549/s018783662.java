import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ans = (1<<m) * (1900 * m + 100 * (n - m));
		System.out.println(ans);
	}
}