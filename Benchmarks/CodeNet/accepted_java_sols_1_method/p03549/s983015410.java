import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int ans = 1900 * m + 100 * (n - m);
		for (int i = 0; i < m; i++)
			ans *= 2;
		System.out.println(ans);
	}
}