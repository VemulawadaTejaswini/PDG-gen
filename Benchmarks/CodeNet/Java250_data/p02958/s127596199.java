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
        int a=0,b=0,p=1;
        while (true) {
            int c=ni();
            if (c==p) {
                p++; 
                if (p>n) break;
                continue;
            }
            a=p;
            b=c;
            p++;
            break;
        }
        if (a==0) {System.out.println("YES"); return;}
        
        while (true) {
            int c=ni();
            if (c==p) {
                p++; 
                if (p>n) { System.out.println("NO"); return; }
                continue;
            }
            if (c==a && p==b) {p++; break;}
            System.out.println("NO");
            return;
        }
        
        while (p<=n) {
            if (ni()==p) {p++; continue;}
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }
    
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}