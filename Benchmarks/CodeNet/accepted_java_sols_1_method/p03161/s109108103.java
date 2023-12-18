import java.util.*;

public class Main {
    private static final long INF = 1L<<60;
    private static long[] dp = new long[100010];
    public static void main(String[] args) throws Exception {
        Arrays.fill(dp,INF);
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        List<Integer> steps = new ArrayList<>();
        for(int i=0;i<N;i++){
            steps.add(Integer.parseInt(sc.next()));
        }
        dp[0] = 0;
        for(int i=1;i<N;i++){
            for(int j=1;j<=K && j<=i;j++){
                dp[i] = Math.min(dp[i],dp[i-j] + Math.abs(steps.get(i) - steps.get(i-j)));
            }
        }
        System.out.println(dp[N-1]);
    }
}


// dp[i] = Math.min(dp[i-1] + Math.abs(steps.get(i) - steps.get(i-1)) ,dp[i-2] + Math.abs(steps.get(i) - steps.get(i-2)));
//2マスまでジャンプできる場合
// dp[i] = Math.min(dp[i-1] + Math.abs(steps.get(i) - steps.get(i-1)) , dp[i-2] + Math.abs(steps.get(i) - steps.get(i-2)));
//の時点でdp[i]には"１マスジャンプまたは2マスジャンプの最小値"が格納されている
//ので、"3マスジャンプとの比較"を考えたい場合は、次のようになる
// dp[i] = Math.min(dp[i],dp[i-3] + Math.abs(steps.get(i) - steps.get(i-3)));(ただしi>=3)
//従って、dp[i]の更新式は以下となる
// dp[i] = Math.min(dp[i],dp[i-j] + Math.abs(steps.get(i) - steps.get(i-j)));
// 1 <= i < N, 1 <= j < K , j <= i;