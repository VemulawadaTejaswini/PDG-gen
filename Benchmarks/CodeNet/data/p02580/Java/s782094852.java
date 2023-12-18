import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
			InputStream inputStream = System.in;
			OutputStream outputStream = System.out;
			FastInput in = new FastInput(inputStream);
			PrintWriter out = new PrintWriter(outputStream);
			ABC176E solver = new ABC176E();
			solver.solve(1, in, out);
			out.close();
		}

		static class ABC176E {

			public void solve(int testNum, FastInput in, PrintWriter out) {
				
				int h = in.nextInt();
				int w = in.nextInt();
				int m = in.nextInt();
				
				int [][]hcnt = new int [h][2];
				int [][]wcnt = new int [w][2];
				List<List<Integer>> grid = new ArrayList<>();
				
				
				for(int i = 0 ; i < h ;i++) {
					hcnt[i][0] = i;
					grid.add(new ArrayList<Integer>());
				}
				for(int i = 0 ; i < w; i++) {
					wcnt[i][0] = i;
				}
				
				for(int i = 0 ;i < m ;i++) {
					int y = in.nextInt()-1;
					int x = in.nextInt()-1;
					grid.get(y).add(x);
					hcnt[y][1]++;
					wcnt[x][1]++;
				}
				
				Arrays.sort(hcnt, (a,b) -> Integer.compare(a[1], b[1])) ;
				Arrays.sort(wcnt, (a,b) -> Integer.compare(a[1], b[1]));
				
				int hmax = hcnt[h-1][1];
				int wmax = wcnt[w-1][1];
				
				int ans = -1;
				for(int i = h-1 ;i >= 0 ;i--) {
					if(hmax > hcnt[i][1]) {
						break;
					}
					for(int j = w-1 ; j >= 0 ;j--) {
						if(wmax > wcnt[j][1]) {
							break;
						}
						int tmp = hcnt[i][1] + wcnt[i][1];
						if(grid.get(hcnt[i][0]).contains(wcnt[i][0])) {
							tmp--;
						}
						ans = Math.max(tmp, ans);
					}
				}
				
				out.println(ans);
				
				

			}

		}
		
static class FastInput{
	private final BufferedReader in;
	private String[] buff;
	private int index = 0;
	
	public FastInput(InputStream is) {
		in = new BufferedReader(new InputStreamReader(is));
	}
	String nextLine() {
		try {
			return in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	String next() {
		while (buff == null || index >= buff.length) {
			buff = nextLine().split(" ");
			index = 0;
		}
		return buff[index++];
	}
	int nextInt() {
		return Integer.parseInt(next());
	}
	
	long nextLong() {
		return Long.parseLong(next());
	}
	
	Double nextDouble() {
		return Double.parseDouble(next());
	}
	
	BigInteger nextBigInteger() {
		return new BigInteger(next());
	}
	
	BigDecimal nextBigDecimal() {
		return new BigDecimal(next());
	}
	
	public int[] nextIntArray(final int n) {
		final int[] res = new int [n];
		
		for(int i = 0 ; i < n ;i++) {
			res[i] = nextInt();
		}
		return res;
	}
	
	public long[] nextLongArray(final int n) {
		final long[] res= new long [n];
		
		for(int i = 0 ; i < n ;i++) {
			res[i] = nextLong();
		}
		return res;
	}
	
	public double[] nextDoubleArray(final int n ) {
		final double[] res = new double [n];
		
		for(int i = 0 ; i < n ;i++) {
			res[i] = nextDouble();
		}
		return res;
	}
	
	
	public int[][] nextInt2DArray(final int n , final int m){
		int [][]res = new int [n][m];
		
		for(int i = 0 ; i < n ;i++) {
			for(int j = 0 ; j < m ;j++) {
				res[i][j] = nextInt();
			}
		}
		return res;
	}
	public long[][] nextLong2DArray(final int n , final int m){
		long [][]res = new long [n][m];
		
		for(int i = 0 ; i < n ;i++) {
			for(int j = 0 ; j < m ;j++) {
				res[i][j] = nextLong();
			}
		}
		return res;
	}
	
	public char[][] nextChar2DArray(final int n){
		char [][]res = new char [n][];
		
		for(int i = 0 ; i < n ;i++) {
			String s = next();
			res[i] = s.toCharArray();
		}
		
		return res;
	}
}


	

}
