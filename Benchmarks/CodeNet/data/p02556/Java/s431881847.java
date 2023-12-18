import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
 
public class Main {
 
    void solve() throws IOException {
        int N = ni();
        int[] x = new int[N];
        int[] y = new int[N];
        int minx = Integer.MAX_VALUE;
        int miny = Integer.MAX_VALUE;
        int maxx = Integer.MIN_VALUE;
        int maxy = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            int X = ni();
            int Y = ni();
            minx = Math.min(minx, X);
            miny = Math.min(miny, Y);
            maxx = Math.max(maxx, X);
            maxy = Math.max(maxy, Y);
            x[i] = X;
            y[i] = Y;
        }
        int minyminx = Integer.MAX_VALUE;
        int minymaxx = Integer.MIN_VALUE;
        int maxyminx = Integer.MAX_VALUE;
        int maxymaxx = Integer.MIN_VALUE;
        int minxminy = Integer.MAX_VALUE;
        int minxmaxy = Integer.MIN_VALUE;
        int maxxminy = Integer.MAX_VALUE;
        int maxxmaxy = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if(x[i] == minx) {
                minxminy = Math.min(minxminy, y[i]);
                minxmaxy = Math.max(minxmaxy, y[i]);
            }
            if(x[i] == maxx) {
                maxxminy = Math.min(maxxminy, y[i]);
                maxxmaxy = Math.max(maxxmaxy, y[i]);
            }
            if(y[i] == miny) {
                minyminx = Math.min(minyminx, x[i]);
                minymaxx = Math.max(minymaxx, x[i]);
            }
            if(y[i] == maxy) {
                maxyminx = Math.min(maxyminx, x[i]);
                maxymaxx = Math.max(maxymaxx, x[i]);
            }
        }
        long[] xx = new long[8];
        long[] yy = new long[8];
        xx[0] = minyminx;
        yy[0] = miny;
        xx[1] = minymaxx;
        yy[1] = miny;
        xx[2] = maxx;
        yy[2] = maxxminy;
        xx[3] = maxx;
        yy[3] = maxxmaxy;
        xx[4] = maxymaxx;
        yy[4] = maxy;
        xx[5] = maxyminx;
        yy[5] = maxy;
        xx[6] = minx;
        yy[6] = minxmaxy;
        xx[7] = minx;
        yy[7] = minxminy;
        long ans = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                ans = Math.max(ans, Math.abs(xx[i]-xx[j]) + Math.abs(yy[i]-yy[j]));
            }
        }
        out.println(ans);
    }

    final int mod = 1000000007;
    final BigInteger MOD = BigInteger.valueOf(mod);

    int mul(int x, int y){
        int val = (int)((x * 1L * y) % mod);
        return val>=0 ? val : val+mod;
    }
    int add(int x, int y) {
        x += y;
        if(x < 0) x += mod;
        if(x>=mod) x -= mod;
        return x;
    }
    int sub(int x, int y){
        x = add(x,mod-y);
        if(x < 0) x += mod;
        if(x>=mod) x -= mod;
        return x;
    }
    String ns() throws IOException {
        while (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine(), " ");
        }
        return tok.nextToken();
    }
 
    int ni() throws IOException {
        return Integer.parseInt(ns());
    }
 
    long nl() throws IOException {
        return Long.parseLong(ns());
    }
 
    double nd() throws IOException {
        return Double.parseDouble(ns());
    }
 
    String[] nsa(int n) throws IOException {
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = ns();
        }
        return res;
    }
 
    int[] nia(int n) throws IOException {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = ni();
        }
        return res;
    }
 
    long[] nla(int n) throws IOException {
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            res[i] = nl();
        }
        return res;
    }
 
    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;
 
    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        tok = new StringTokenizer("");
        Main main = new Main();
        main.solve();
        out.close();
    }
}