import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().trim().split(" ");
        long n = Long.parseLong(s[0]);
        long m = Long.parseLong(s[1]);
        long ans = 0;
        int k = (int)m;
        for(int i=k+1; i<=n; i++) {
            int z = (int)(n)/i;
            long x = 0;
            if(n%i!=0) {
                x = n%i - k + 1;
                if(k==0) x--;
            }
            long y = (i-k)*z + (x<0?0:x);
            ans += y;
//            System.out.println("y: " + y + "  i: " + i);
        }
        System.out.println(ans);
    }
}