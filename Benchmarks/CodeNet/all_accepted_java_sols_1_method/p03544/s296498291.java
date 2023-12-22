import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		long[] memo = { 2, 1 };
		long ans = 0;
		if (n >= 2) {
			for (int i = 0; i <= n - 2; i++) {
				ans = memo[0] + memo[1];
				memo[0] = memo[1];
				memo[1] = ans;
			}
		}else{
			if (n==1) {
				ans=1;
			}else {
				ans=2;
			}
		}

		System.out.println(ans);

		scanner.close();
	}

}
