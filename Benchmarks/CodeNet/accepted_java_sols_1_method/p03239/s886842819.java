import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

class Main
{
    /**
     * ABC 112 B: Time Limit Exceeded
     *     (制限時間以内の最小コストの経路)
     */ 
    public static void main(String[] args)
    {
        // 入力値
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int T = scan.nextInt();
        
        int[][] cts = new int[N][2];
        for (int i = 0; i < N; i++) {
            cts[i][0] = scan.nextInt();
            cts[i][1] = scan.nextInt();
        }
        
        scan.close();
        scan = null;
        
        // 制限時間以内の最小コストの経路を求める
        Optional<int[]> tmp = Arrays.stream(cts)
                .filter(ct -> ct[1] <= T)
                .min((a, b) -> a[0] - b[0]);
        int cost = tmp.orElse(new int[2])[0];
        
        // 出力
        System.out.println(cost > 0 ? cost : "TLE");
    }
}
