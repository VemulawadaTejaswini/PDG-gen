import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
      int N = in.nextInt();
      int K = in.nextInt();
      int[] a = new int[N];
      for (int i = 0; i < N; i++) {
        a[i] = in.nextInt();
      }
      int[] dp = new int[N];
      dp[0] = 0;
      dp[1] = Math.abs(a[0] - a[1]);
      for(int i = 2; i< N ;i++){
        int k = 1;
        int temp = Integer.MAX_VALUE;
        while(k <= K && i-k >=0){
          temp = Math.min(temp, dp[i-k] + Math.abs(a[i] - a[i-k]));
          k++;
        }
        dp[i] = temp;
      }
      System.out.println(dp[N-1]);
	}
}
