import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans += (sc.nextInt() >= k) ? 1 : 0;
		}
		System.out.println(ans);	
	}
}