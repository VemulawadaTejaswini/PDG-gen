import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int D = sc.nextInt();
        int A[][] = new int[H][W];
        int rA[][] = new int[H*W+1][2];
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {
                int x = sc.nextInt();
                A[i][j] = x;
                rA[x][0] = i;
                rA[x][1] = j;
            }
        }
        
        long cost[] = new long[H*W+1];
        for(int a = 1; a <= H*W; a++ ){
            if( a + D > H*W ) break;
            int i = rA[a][0];
            int j = rA[a][1];
            int x = rA[a+D][0];
            int y = rA[a+D][1];
            cost[a+D] = cost[a] + (long)Math.abs(i - x) + (long)Math.abs(j - y);
        }
        
        int Q = sc.nextInt();
        for(int i = 0; i < Q; i++) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            System.out.println( cost[R] - cost[L] );
        }
    }
}
