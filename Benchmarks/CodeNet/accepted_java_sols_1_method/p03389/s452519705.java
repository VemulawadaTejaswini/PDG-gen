import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        // int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int a =  Integer.parseInt(st.nextToken());
        int b =  Integer.parseInt(st.nextToken());
        int c =  Integer.parseInt(st.nextToken());
        int min = Integer.MAX_VALUE;
        for(int i=-2; i<=52; i++) {
          int ans = 0;
          if(a >= i) ans += (a-i);
          else {
            if((i-a) % 2 == 0) ans += (i-a)/2;
            else ans += (i-a)/2 + 2;
          }

          if(b >= i) ans += (b-i);
          else {
            if((i-b) % 2 == 0) ans += (i-b)/2;
            else ans += (i-b)/2 + 2;
          }

          if(c >= i) ans += (c-i);
          else {
            if((i-c) % 2 == 0) ans += (i-c)/2;
            else ans += (i-c)/2 + 2;
          }
          if(ans < min) min = ans;
        }
        out.println(min);
        // int[] a = new int[n];
        // for(int i=0; i<n; i++) a[i] =  Integer.parseInt(st.nextToken());

        out.close(); System.exit(0);
    }


}
