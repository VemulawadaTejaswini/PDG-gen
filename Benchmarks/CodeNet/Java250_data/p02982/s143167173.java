import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class  Main{
    public static void main(String[] args) throws Exception{
    	MScanner sc = new MScanner(System.in);
        //MScanner sc = new MScanner("reduce.in");
        PrintWriter pw=new PrintWriter(System.out);
        int n=sc.nextInt();int m=sc.nextInt();
        int[][]co=new int[n][m];
        for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		co[i][j]=sc.nextInt();
        	}
        }
        int ans=0;
        for(int i=0;i<n;i++) {
        	for(int j=i+1;j<n;j++) {
        		int dist=0;
        		for(int o=0;o<m;o++) {
        			dist+=(co[i][o]-co[j][o])*(co[i][o]-co[j][o]);
        		}
        		if((Math.sqrt(dist))%1==0) {
        			ans++;
        		}
        	}
        }
        pw.println(ans);
        pw.flush();
    }
    
    
    static class MScanner {
		StringTokenizer st;
		BufferedReader br;
 
		public MScanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}
 
		public MScanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}
 
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
 
		public String nextLine() throws IOException {
			return br.readLine();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
 
		public char nextChar() throws IOException {
			return next().charAt(0);
		}
 
		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}