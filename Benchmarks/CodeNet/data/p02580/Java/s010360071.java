
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

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
				
				Set<Pair> bomset = new HashSet<>();
				int []c = new int [h];
				int []l = new int [w];
				
				for(int i = 0 ; i < m ;i++) {
					int y = in.nextInt()-1;
					int x = in.nextInt()-1;
					bomset.add(new Pair(y,x));
					c[y]++;
					l[x]++;
				}
				int colmax = MaxNum(c, h);
				int lowmax = MaxNum(l, w);
				
				List<Integer> col = new ArrayList<Integer>();
				List<Integer> low = new ArrayList<Integer>();
				
				for(int i = 0 ; i < h ;i++) {
					if(colmax == c[i]) {
						col.add(i);
					}
				}
				for(int i = 0 ; i < w ;i++) {
					if(lowmax == l[i]) {
						low.add(i);
					}
				}
				
				int ans = colmax + lowmax -1;
				
				if(m < col.size()*(long)low.size()) {
					out.println(ans +1);
					return;
				}
				
				for(int p : col) {
					for(int q : low) {
						Pair r = new Pair(p,q);
						if(!bomset.contains(r)) {
							out.println(ans+1);
							return;
						}
					}
				}
				
				out.println(ans);
			}
			
		static int MaxNum (int []a , int n) {
			int max = Integer.MIN_VALUE;
			for(int i = 0 ; i < n ;i++) {
				max = Math.max(max, a[i]);
			}
			return max;
		}
	}
	
		static class Pair{
			
			private int y;
			private int x;
			
			public Pair(int y, int x) {
				this.y = y;
				this.x = x;
			}
			
			@Override
			public boolean equals(Object obj) {
				
				if(this == obj) {
					return true;
				}
				
				if(!(obj instanceof Pair) || obj == null) {
					return false;
				}
				
				Pair p = (Pair)obj;
				return (this.y == p.y) && (this.x == p.x);
			}
			
			@Override 
			public int hashCode() {
				 return Objects.hash(y,x);
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
