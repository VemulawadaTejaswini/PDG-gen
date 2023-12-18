import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int n = 0;
		for (int i = 1; i <= 1000001; i++) {
			n = 10 * n + 7;
			if (n % K == 0) {
				System.out.println(i);
				return;
			}
			n %= K;
		}
		System.out.println(-1);
	}
}
