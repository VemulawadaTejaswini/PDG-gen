import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	PrintWriter out = new PrintWriter(System.out);
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tok = new StringTokenizer("");
    String next() throws IOException {
        if (!tok.hasMoreTokens()) { tok = new StringTokenizer(in.readLine()); }
        return tok.nextToken();
    }
    int ni() throws IOException { return Integer.parseInt(next()); }
    long nl() throws IOException { return Long.parseLong(next()); }
    
    void solve() throws IOException {
        int n=ni();
        long mod=1000000007;
        long total=0;
        long[]A=new long[n];
        for (int i=0;i<n;i++) {
            A[i]=ni();
            total+=A[i];
        }
        
        long ans=0;
        for (int i=0;i<n;i++) {
            total-=A[i];
            ans=(ans+A[i]*(total%mod))%mod;
        }
        
        out.println(ans);
        out.flush();
    }
    
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}