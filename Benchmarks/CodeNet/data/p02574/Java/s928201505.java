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
        int[]A=new int[n];
        for (int i=0;i<n;i++) A[i]=ni();
        
        ArrayList<Integer>P=new ArrayList();
        boolean[]F=new boolean[1001];
        for (int i=2;i<1001;i++) {
            if (!F[i]) {
                P.add(i);
                for (int j=i;j<1001;j+=i) F[j]=true;
            }
        }
        
        int q=P.size();
        boolean[]G=new boolean[q];
        int[]H=new int[q];
        
        boolean cp=true;
        
        for (int i=0;i<n;i++) {
            for (int j=0;j<q;j++) {
                if (A[i]%P.get(j)==0) {
                    if (G[j]) cp=false;
                    else G[j]=true;
                    H[j]++;
                }
            }
        }
        
        if (cp) out.println("pairwise coprime");
        else {
            cp=true;
            for (int i=0;i<q;i++)
                if (H[i]==n) cp=false; 
                
            if (cp) out.println("setwise coprime");
            else out.println("not coprime");
        }
        
        //out.println(ans);
        out.flush();
    }
    
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}