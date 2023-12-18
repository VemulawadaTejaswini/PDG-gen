import java.io.*;
import java.util.*;
import java.awt.geom.*;

public class Main {
    double box_len;
    double rs[];
    BufferedReader br;
    double[][] dp;
    int n;

    Main() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    boolean init() {
        try {
            String[] data = br.readLine().split(" ");
            box_len = Double.parseDouble(data[0]);
            rs = new double[data.length-1];
            n = rs.length;
            for (int i = 1; i < data.length; i++) 
                rs[i-1] = Double.parseDouble(data[i]);

            dp = new double[n][1<<n]; 

            return true;
        } catch (IOException e) {
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }

    double dist(double a, double b) {
        return Math.sqrt( (a+b)*(a+b) - (a-b)*(a-b) );
    }

    double solve(int v, int S) {
//        System.out.printf("%d %d\n", v, S);
        if (S == ((1<<n)-1)) return rs[v];
        if (dp[v][S] > 0) return dp[v][S];

        double minl = INF;
        for (int i = 0; i < n; i++) {
            if ((S & (1<<i)) != 0) continue;
            minl = Math.min(minl, solve(i, S + (1<<i)) + dist(rs[v], rs[i]));
        }

        return dp[v][S] = minl;
    }

    static final double INF = 1e18;
    void run() {
        while (init()) {
            double min_len = INF;

            for (int i = 0; i < n; i++) 
                min_len = Math.min(min_len, solve(i, (1<<i)) + rs[i]);

            if (box_len >= min_len) 
                System.out.println("OK");
            else
                System.out.println("NA");
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}