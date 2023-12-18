import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N  = sc.nextInt();
        int K  = sc.nextInt();


        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < K; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            for (int j = l; j <=r ; j++) {
                set.add(j);
            }
        }


        long[] dp = new long[N];
        dp[0] = 1;

        int MOD = 998_244_353;
        for (int i = 0; i < N-1; i++) {
            for(Integer jump:set){
                if(i+jump<N){
                    long sum = dp[i+jump]+dp[i];
                    dp[i+jump]=sum%MOD ;
                }
            }
        }

        System.out.println(dp[N-1]);


    }
}