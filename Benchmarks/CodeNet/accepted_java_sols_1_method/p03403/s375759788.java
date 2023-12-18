import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // Scanner scan = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] a = new int[n+2];
        for(int i=0; i<n; i++) a[i+1] =  Integer.parseInt(st.nextToken());
        a[0] = 0;
        a[n+1] = 0;
        long total = 0;
        for(int i=1; i<n+2; i++) total += Math.abs(a[i] - a[i-1]);
        for(int i=1; i<n+1; i++) {
          long new_val = total - Math.abs(a[i] - a[i-1]) - Math.abs(a[i] - a[i+1]) + Math.abs(a[i-1] - a[i+1]);
          out.println(new_val);
        }



        out.close(); System.exit(0);
    }


}
