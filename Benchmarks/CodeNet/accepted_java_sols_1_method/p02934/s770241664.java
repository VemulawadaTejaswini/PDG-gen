import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] a = new int[n]; for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
        double ans = 0;
        for(int i=0; i<n; i++) ans += 1.0/a[i];
        ans = 1.0/ans;
        out.println(ans);

        // int n = Integer.parseInt(st.nextToken());

        out.close(); System.exit(0);
    }
}
