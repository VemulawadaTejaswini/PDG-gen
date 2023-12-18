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
        String s=next();
        int[]A=new int[n+2];
        int r=0;
        int w=0;
        for (int i=1;i<=n;i++) {
            if (s.charAt(i-1)=='R') { r++; A[i]=1; }
            else w++;
        }
        
        int ans=Math.min(r,w);
        
        A[0]=-1;
        A[n+1]=-1;
        int a2=0;
        int p=0;
        int q=n+1;
        while (r>0 && w>0) {
            while (A[p]!=0) p++;
            while (A[q]!=1) q--;
            if (p>q) break;
            A[p]=1;
            A[q]=0;
            a2++;
            r--;
            w--;
        }
        ans=Math.min(ans,a2);
        System.out.println(ans);
    }
    
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}