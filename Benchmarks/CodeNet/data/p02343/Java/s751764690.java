import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static class UnionFind{
	    int[] par; // 
	    
	    public UnionFind(int n){
	        par = new int[n];
	        for(int i = 0; i < n; i++){ par[i] = -1; }
	    }
	    
	    public int find(int x){
	        if(par[x] < 0){
	            return x;
	        }else{
	            return par[x] = find(par[x]);
	        }
	    }
	    
	    public boolean union(int x, int y){
	        x = find(x);
	        y = find(y);
	        
	        if(x != y){
	            if(par[y] < par[x]) {  // 多い方が根になるようにスワップする.
	                int tmp = x; x = y; y = tmp;
	            }
	            par[x] += par[y];
	            par[y] = x;
	            return true;
	        }else{
	            return false;
	        }
	    }
	    
	    public boolean same(int x, int y){
	        return find(x) == find(y);
	    }
	    
	    public int size(int x){
	        return -par[find(x)];
	    }
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		final int q = sc.nextInt();
		
		UnionFind uf = new UnionFind(n);
		for(int i = 0; i < q; i++){
			final int com = sc.nextInt();
			final int x   = sc.nextInt();
			final int y   = sc.nextInt();
			
			if(com == 0){
				uf.union(x, y);
			}else{
				System.out.println(uf.same(x, y) ? 1 : 0);
			}
		}
		
		sc.close();
	}
	
	public static class Scanner {
	    private BufferedReader br;
	    private StringTokenizer tok;

	    public Scanner(InputStream is) throws IOException {
	        br = new BufferedReader(new InputStreamReader(is));
	    }

	    private void getLine() throws IOException {
	        while (!hasNext()) { tok = new StringTokenizer(br.readLine()); }
	    }

	    private boolean hasNext() {
	        return tok != null && tok.hasMoreTokens();
	    }

	    public String next() throws IOException {
	        getLine(); return tok.nextToken();
	    }

	    public int nextInt() throws IOException {
	        return Integer.parseInt(next());
	    }
	    // 他のnextXXXもXXX.parseXXX()メソッドを使って作れるので省略
	    
	    public void close() throws IOException {
	        br.close();
	    }
	}
}