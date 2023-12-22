import java.util.*;
import java.text.*;

public class Main {
    static long MOD = (long)1e9+7;
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] a = new long[n];
        for(int i = 0; i< n; i++)a[i] = in.nextLong();
        
        long[][] res = new long[n][n];
        for(int i = 0; i< n; i++)Arrays.fill(res[i], Long.MAX_VALUE);
        for(int i = 0; i< n; i++){
            if(n%2 == 1)res[i][i] = a[i];
            else res[i][i] = -a[i];
        }
        for(int sz = 2; sz<= n; sz++){
            int turn = (n-sz)%2;
            for(int l = 0, r = sz-1; r < n; l++, r++){
                if(turn == 0)res[l][r] = Math.max(a[l]+res[l+1][r], res[l][r-1]+a[r]);
                else res[l][r] = Math.min(-a[l]+res[l+1][r], res[l][r-1]-a[r]);
            }
        }
        System.out.println(res[0][n-1]);
    }
}