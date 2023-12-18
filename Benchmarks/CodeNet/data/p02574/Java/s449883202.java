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
        HashSet<Integer>G=new HashSet();
        HashMap<Integer,Integer>H=new HashMap();
        
        boolean cp=true;
        
        for (int i=0;i<n;i++) {
            for (int j=0;j<q;j++) {
                if (A[i]%P.get(j)==0) {
                    if (G.contains(P.get(j))) cp=false;
                    else G.add(P.get(j));
                    if (H.containsKey(P.get(j))) H.put(P.get(j),H.get(P.get(j))+1);
                    else H.put(P.get(j),1);
                    while (A[i]%P.get(j)==0) A[i]/=P.get(j);
                    if (A[i]==1) break;
                }
            }
            if (A[i]>1) {
                if (G.contains(A[i])) cp=false;
                else G.add(A[i]);
                if (H.containsKey(A[i])) H.put(A[i],H.get(A[i])+1);
                else H.put(A[i],1);
            }
        }
        
        if (cp) out.println("pairwise coprime");
        else {
            cp=true;
            for (Integer v:H.keySet())
                if (H.get(v)==n) cp=false; 
                
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