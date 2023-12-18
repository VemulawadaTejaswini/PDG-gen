import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeSet;
 
public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		final int W = sc.nextInt();
		final int H = sc.nextInt();
		
		int[] x_all = new int[W + 1];
		int[] y_all = new int[H + 1];
		
		for(int i = 0; i < N; i++){
			final int x = sc.nextInt();
			final int y = sc.nextInt();
			final int w = sc.nextInt();
			
			final int x_min = Math.max(0, x - w);
			final int x_max = x + w;
			final int y_min = Math.max(0, y - w);
			final int y_max = y + w;
			x_all[x_min]++;
			if(x_max <= (W - 1)){ x_all[x_max + 1]--; }
			y_all[y_min]++;
			if(y_max <= (H - 1)){ y_all[y_max + 1]--; }
		}
		
		boolean x_ok = x_all[0] >= 1;
		for(int i = 1; i <= W; i++){
			x_all[i] += x_all[i - 1];
			x_ok &= (x_all[i] >= 1);
		}
		boolean y_ok = y_all[0] >= 1;
		for(int i = 1; i <= H; i++){
			y_all[i] += y_all[i - 1];
			y_ok &= (y_all[i] >= 1);
		}
		
		//System.out.println(Arrays.toString(x_all));
		//System.out.println(Arrays.toString(y_all));
		
		System.out.println((x_ok || y_ok) ? "Yes" : "No");
		
	}
 
	public static class Scanner implements Closeable {
		private BufferedReader br;
		private StringTokenizer tok;
 
		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}
 
		private void getLine() throws IOException {
			while (!hasNext()) {
				tok = new StringTokenizer(br.readLine());
			}
		}
 
		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}
 
		public String next() throws IOException {
			getLine();
			return tok.nextToken();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public void close() throws IOException {
			br.close();
		}
	}
 
}