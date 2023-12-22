import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int d = Integer.parseInt(sc.next());
		int ans = 0;
		for (int i = n; i >= 1; i--) {
			i = i - 2 * d;
			ans++;
		}
		System.out.println(ans);
		sc.close();
	}
}