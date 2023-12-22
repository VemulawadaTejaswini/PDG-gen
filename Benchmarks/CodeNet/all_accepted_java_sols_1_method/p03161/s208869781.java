import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] temp = scanner.nextLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int k = Integer.parseInt(temp[1]);

		String[] temp2 = scanner.nextLine().split(" ");
		int[] 	 list  = new int[n];

		for(int i = 0; i < n; i++) {
			list[i] = Integer.parseInt(temp2[i]);
		}


		int[] dp = new int[n+1];

		Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n && j <= i + k; j++){
                dp[j] = Math.min(dp[j], dp[i] + Math.abs(list[j] - list[i]));
            }
        }

        System.out.println(dp[n - 1]);


	}

}
