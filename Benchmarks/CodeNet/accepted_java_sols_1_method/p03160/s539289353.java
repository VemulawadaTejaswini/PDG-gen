import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());

		ArrayList<Integer> h = new ArrayList<>();

		for (int i=0; i<n; i++){
			h.add(Integer.parseInt(sc.next()));
		}

		int[] dp = new int[n];

		dp[1] = Math.abs(h.get(1) - h.get(0));

		for (int i=2; i<n; i++){
			dp[i] = Math.min(Math.abs(h.get(i) - h.get(i-1)) + dp[i-1], Math.abs(h.get(i) - h.get(i-2)) + dp[i-2]);
		}
		System.out.println(dp[n-1]);
	}
}
