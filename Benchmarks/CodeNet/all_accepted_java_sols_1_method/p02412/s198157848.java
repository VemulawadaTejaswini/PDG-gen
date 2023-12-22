import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    private static final int[][] tbl_;
    private static final int N = 101, X = 298;
    
    static {
        int[][] tbl = new int[N][X];
        for(int i = 3; i < N; i++) {
            double v = 1;
            for(int j = i + 3; j <= (i - 1) * 3; j++) {
                for(int k = i; k < N; k++) {
                    tbl[k][j] += (int)v;
                }
                if(j < i * 2) {
                    v += 0.5;
                } else {
                    v -= 0.5;
                }
            }
        }
        tbl_ = tbl;
    }
    
    public static void main(String[] args) {
        while(scn.hasNextInt()) {
            int n = scn.nextInt(), x = scn.nextInt();
            if(n > 0) {
                System.out.println(0 < x && x < X ? tbl_[n][x] : 0);
            }
        }
    }
}