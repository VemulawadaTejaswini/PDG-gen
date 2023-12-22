import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean dp[] = new boolean[55552];
		dp[0] = dp[1] = true;
		List<Integer> prime = new LinkedList<Integer>();
		prime.add(2);
		for(int i = 2; i <= 55551; i++) {
			if(dp[i] == false) {
				for(int j = i * 2; j <= 55551; j += i) {
					dp[j] = true;
				}
				if(i % 5 == 1) prime.add(i);
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.print(prime.get(i) + " ");
		}
	}
}