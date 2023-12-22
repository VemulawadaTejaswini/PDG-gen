import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N+1];
        for(int i = 1; i <= N; i++) A[i] = sc.nextInt();
        // dp[i][j]：先頭がｉ番目、末尾がｊ番目から始まる時のＸ－Ｙ（後手の時はＹ－Ｘ）
        long[][] dp = new long[N+1][N+1];
        // len：のこりの要素数
        for(int len = 1; len <= N; len++){
            // i：残り要素の先頭位置
            for(int i = 1; len +i -1 <= N; i++){
                int j = len +i -1;
                if(len == 1){
                    dp[i][j] = A[i];
                }else{
                    // 現在取れる要素から、それ以降の相手の得点
                    // （厳密には先手視点ではＹ－Ｘ，後手視点ではＸ－Ｙ）を引いた結果のうち、
                    // より大きくなるほうを選択する
                    dp[i][j] = Math.max(A[i] - dp[i+1][j], A[j] - dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[1][N]);
        sc.close();

    }

}
