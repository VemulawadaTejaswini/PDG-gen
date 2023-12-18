import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        
        boolean[][] S = new boolean[N][M];
        for (int i = 0; i < M; i++) {
            int k = in.nextInt();
            for (int j = 0; j < k; j++) {
                int s = in.nextInt() - 1;
                S[s][i] = true;
            } 
        } 
       
        int[] P = new int[M];
        for (int i = 0; i < M; i++) {
            P[i] = in.nextInt();
        }
       
        int X = 1 << N;
        int res = 0;
        for (int x = 0; x < X; x++) {
            int[] A = new int[M];
            for (int n = 0; n < N; n++) {
                if ((x >> n & 1) == 1) {
                    for (int m = 0; m < M; m++) {
                        if (S[n][m]) {
                            A[m] += 1;
                        }
                    }
                }
            }
            
            boolean b = true;
            for (int m = 0; m < M; m++) {
                b &= ((A[m] % 2) == P[m]);
            }
            
            if (b) {
                res += 1;
            }
        }
        
        System.out.println(res);
    }
}
