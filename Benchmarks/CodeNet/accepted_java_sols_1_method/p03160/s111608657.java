import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] dp = new int[n];
		ArrayList<Integer> hArrayList = new ArrayList<>();
		for (int i=0; i<n; i++) {
			hArrayList.add(sc.nextInt());
		}

		dp[0] = 0;
		dp[1] = Math.abs(hArrayList.get(0)-hArrayList.get(1));

		for (int i=2; i<n; i++){
			dp[i] = Math.min(dp[i-1]+Math.abs(hArrayList.get(i)-hArrayList.get(i-1)), dp[i-2]+Math.abs(hArrayList.get(i)-hArrayList.get(i-2)));
		}

		System.out.println(dp[n-1]);
    }
}
