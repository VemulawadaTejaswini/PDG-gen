import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class Main {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] h = new int[N+100];
    for (int i = 0; i < N; i++) {
      h[i] = sc.nextInt();
    }
    int[] dp = new int[N+100];

//    dp[0] = 0;
//    for (int i = 1; i <N ; i++) {
//      //morau dp
//      dp[i] = Integer.MAX_VALUE;
//
//      for (int j =i-K ; j <i ; j++) {
//        if(j >=0) {
//          dp[i] = Math.min(dp[i], dp[j] + Math.abs(h[i]-h[j]));
//        }
//      }
//
//    }

    Arrays.fill(dp,Integer.MAX_VALUE);
    dp[0]=0;

    for (int i = 0; i < N; i++) {
      for (int j = i+1; j <=i+K ; j++) {
        dp[j] = Math.min(dp[j],dp[i] + Math.abs(h[i]-h[j]));
      }
    }

    System.out.println(dp[N-1]);


  }


}
