import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main{
    static long ans = 0;
    static int mod = 998244353;
    public static void main(String[] args) {
        ans = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        PriorityQueue<Integer>queue = new PriorityQueue<>();
        for(int i = 0;i < k;i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            for(int j = l;j <= r;j++){
                queue.add(j);
            }
        }
        int[]arr = new int[queue.size()];
        for(int i = 0;i < arr.length;i++){
            arr[i] = queue.poll();
        }
        long[]dp = new long[n + 1];
        dp[1] = 1;
        for(int i = 2;i <= n ;i++){
            for(int j = 0;j < arr.length;j++){
                int bf = i - arr[j];
                if(bf >= 0){
                    dp[i] += dp[bf] % mod;
                    dp[i] %= mod;
                }else{
                    break;
                }
            }
        }
        System.out.println(dp[n]);
    }

}
