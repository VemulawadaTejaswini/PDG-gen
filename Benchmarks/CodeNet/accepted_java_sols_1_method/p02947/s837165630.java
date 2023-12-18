import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());
        String[] s = new String[n];
        for(int i=0; i<n; i++) {
          char[] t = bf.readLine().toCharArray();
          Arrays.sort(t);
          s[i] = new String(t);
        }
        Arrays.sort(s);
        long count = 1;
        long ans = 0;
        for(int i=1; i<n; i++) {
          if(s[i].equals(s[i-1])) count++;
          else {
            ans += count*(count-1)/2;
            count=1;
          }
        }
        ans += count*(count-1)/2;
        out.println(ans);
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        // int[] a = new int[n]; for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
        // int n = Integer.parseInt(st.nextToken());

        out.close(); System.exit(0);
    }
}
