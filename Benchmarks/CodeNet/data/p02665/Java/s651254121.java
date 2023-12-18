import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] sp = br.readLine().split(" ");
        int[] a = new int[n+1];
        for(int i = 0; i <= n; i++) {
            a[i] = Integer.parseInt(sp[i]);
        }

        long[] upL = new long[n+1];
        long[] upR = new long[n+1];
        long[] down = new long[n+1];
        
        upL[n] = a[n];
        upR[n] = a[n];
        for(int i = n-1; i >= 0; i--) {
            upL[i] = upL[i+1]/2 + a[i];
            if(upL[i+1]%2 != 0) upL[i]++;
            upR[i] = upR[i+1] + a[i];
        }

        if(upL[0] != 1) {
            System.out.println(-1);
            return;
        }
        
        down[0] = 1;
        for(int i = 1; i <= n; i++) {
            down[i] = (down[i-1] - a[i-1]) * 2;
        }
        long ans = 0;
        for(int i = 0; i <= n; i++) {
            ans += Math.min(upR[i], down[i]);
        }
        System.out.println(ans);
    }
}
