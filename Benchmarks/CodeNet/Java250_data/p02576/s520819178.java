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
        for (int tc=1;tc>0;tc--) {
            int n=ni(),x=ni(),t=ni();
            int ans=n/x;
            if (n%x>0) ans++;
            out.println(ans*t);
        }
        out.flush();
    }
    
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}