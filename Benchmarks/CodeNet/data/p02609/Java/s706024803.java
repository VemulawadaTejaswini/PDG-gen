import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
 
public class Main {
 
    void solve() throws IOException {
        int N = ni();
        String X = ns();
        int popcountx = 0;
        for (int i = 0; i < N; i++) {
            if(X.charAt(i)=='1') popcountx++;
        }
        int[] d2Plus = new int[N+1];
        int[] d2Minu = new int[N+1];
        d2Plus[0] = 1;
        d2Minu[0] = 1;
        for (int i = 1; i <=N; i++) {
            d2Plus[i] = d2Plus[i-1] *2 %(popcountx+1);
            d2Minu[i] = d2Minu[i-1] *2 %(popcountx-1);
        }
        int xmodpopxPlus =0;
        int xmodpopxMinu =0;
        for (int i = 0; i < N; i++) {
            if(X.charAt(i)=='1'){
                xmodpopxPlus = (xmodpopxPlus + d2Plus[N-i-1])%(popcountx+1);
                xmodpopxMinu = (xmodpopxMinu + d2Minu[N-i-1])%(popcountx-1);
            }
        }
        for (int i = 0; i < N; i++) {
            int n = 0;
            if(X.charAt(i)=='1'){
                n = xmodpopxMinu;
                n = sub(n,d2Minu[N-i-1],popcountx-1);
            }else{
                n = xmodpopxPlus;
                n = add(n,d2Plus[N-i-1],popcountx+1);
                // out.println(":"+xmodpopxPlus);
                // out.println(":"+n);
            }
            int count = 1;
            while(n > 0){
                n = n % Integer.bitCount(n);
                count++;
            }
            out.println(count);
        }
    }
    final int mod = 1000000007;
    int mul(int x, int y){
        return (int)((x * 1L * y) % mod);
    }
    int add(int x, int y) {
        x += y;
        return x >= mod ? (x - mod) : x;
    }
    int add(int x, int y, int mod) {
        x += y;
        return x >= mod ? (x - mod) : x;
    }
    int sub(int x, int y){
        x = add(x,mod-y);
        return x >= mod ? (x - mod) : x;
    }
    int sub(int x, int y, int mod){
        x = add(x,mod-y,mod);
        return x >= mod ? (x - mod) : x;
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