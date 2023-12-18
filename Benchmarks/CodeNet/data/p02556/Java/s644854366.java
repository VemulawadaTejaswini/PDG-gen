import java.io.PrintWriter;
import java.util.*;

public class Main {


    static Scanner sc;
    static PrintWriter out;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        out = new PrintWriter(System.out);
        new Main().solve();
        out.flush();
    }

    public void solve() {
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        long[][] d = new long[4][n];
        for(int i=0; i<n; i++) {
            x[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
            d[0][i] = x[i]+y[i];
            d[1][i] = x[i]-y[i];
        }
        long min0 = d[0][0];
        long max0 = d[0][0];
        long min1 = d[1][0];
        long max1 = d[1][0];
        for(int i=0; i<n; i++) {
            min0 = Math.min(min0, d[0][i]);
            max0 = Math.max(max0, d[0][i]);
            min1 = Math.min(min1, d[1][i]);
            max1 = Math.max(max1, d[1][i]);
        }
        long res = Math.max(max0-min0, max1-min1);
        out.println(res);


    }



}