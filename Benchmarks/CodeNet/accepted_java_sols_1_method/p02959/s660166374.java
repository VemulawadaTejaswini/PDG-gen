import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine())+1;
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] a = new int[n]; for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        int[] b = new int[n-1]; for(int i=0; i<n-1; i++) b[i] = Integer.parseInt(st.nextToken());
        long ans = 0;
        for(int i=0; i<n-1; i++) {
          if(b[i] >= a[i]) {
            b[i] -= a[i];
            ans += a[i];
            a[i] = 0;
            if(b[i] >= a[i+1]) {
              b[i] -= a[i+1];
              ans += a[i+1];
              a[i+1] = 0;
            }
            else {
              a[i+1] -= b[i];
              ans += b[i];
              b[i] = 0;

            }
          }
          else {
            ans += b[i];
            a[i] -= b[i];
            b[i] = 0;


          }
        }
        out.println(ans);
        // int n = Integer.parseInt(st.nextToken());

        out.close(); System.exit(0);
    }
}
