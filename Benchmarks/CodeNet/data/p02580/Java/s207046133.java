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
            int h=ni(),w=ni(),m=ni();
            int[] R=new int[h+1];
            int[] C=new int[w+1];
            HashSet<Integer>[]H=new HashSet[h+1];
            for (int i=1;i<=h;i++) H[i]=new HashSet();
            
            for (int i=0;i<m;i++) {
                int u=ni(),v=ni();
                R[u]++;
                C[v]++;
                H[u].add(v);
            }
            
            int rmax=-1;
            ArrayList<Integer>rm=new ArrayList();
            for (int i=1;i<=h;i++) {
                if (R[i]==rmax) rm.add(i);
                if (R[i]>rmax) {
                    rmax=R[i];
                    rm.clear();
                    rm.add(i);
                }
            }
            
            int cmax=-1;
            ArrayList<Integer>cm=new ArrayList();
            for (int i=1;i<=w;i++) {
                if (C[i]==cmax) cm.add(i);
                if (C[i]>cmax) {
                    cmax=C[i];
                    cm.clear();
                    cm.add(i);
                }
            }
            
            int ans=rmax+cmax-1;
            outer:
            for (Integer u:rm) {
                for (Integer v:cm)
                    if (!H[u].contains(v)) { ans++; break outer; }
            }
            
            out.println(ans);
        }
        out.flush();
    }
    
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}