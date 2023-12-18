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
            String s=next();
            int ans=0;
            for (int i=0;i<s.length();i++) ans+=(int)(s.charAt(i)-'0');
            if (ans%9==0) out.println("Yes");
            else out.println("No");
        }
        out.flush();
    }
    
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}