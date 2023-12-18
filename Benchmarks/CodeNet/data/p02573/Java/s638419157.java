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
    
    HashSet<Integer>[]H;
    int n;
    int[]B;
    
    void solve() throws IOException {
        n=ni();
        int m=ni();
        H=new HashSet[n+1];
        for (int i=1;i<=n;i++) H[i]=new HashSet();
        for (int i=0;i<m;i++) {
            int u=ni(),v=ni();
            H[u].add(v);
            H[v].add(u);
        }
        
        B=new int[n+1];
        int ans=0;
        
        for (int i=1;i<=n;i++) {
            if (B[i]>0) continue;
            ans=Math.max(ans,dfs(i));
        }
        
        out.println(ans);
        out.flush();
    }
    
    int dfs(int u) {
        B[u]=1;
        int r=1;
        for (Integer v:H[u]) {
            if (B[v]>0) continue;
            r+=dfs(v);
        }
        return r;
    }
    
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}