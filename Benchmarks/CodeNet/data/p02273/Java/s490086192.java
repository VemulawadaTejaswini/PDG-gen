import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	
	public static void KochCurve(final int deep, final int n, double x1, double y1, double x2, double y2){
		final double x_diff = x2 - x1;
		final double y_diff = x2 - x2;
		
		final double x3_1 = x1 + x_diff / 3;
		final double y3_1 = y1 + y_diff / 3;
		final double x3_2 = x1 + 2 * x_diff / 3;
		final double y3_2 = y1 + 2 * y_diff / 3;
		final double x3_f = Math.cos(Math.toRadians(Math.toDegrees(Math.atan2(y_diff, x_diff)) + 60)) * (Math.sqrt(x_diff * x_diff + y_diff * y_diff) / 3) + x3_1;
		final double y3_f = Math.sin(Math.toRadians(Math.toDegrees(Math.atan2(y_diff, x_diff)) + 60)) * (Math.sqrt(x_diff * x_diff + y_diff * y_diff) / 3) + y3_1;
		
		
		if(deep == n - 1){
			System.out.printf("%.8f %.8f\n",   x1,   y1);
			System.out.printf("%.8f %.8f\n", x3_1, y3_1);
			System.out.printf("%.8f %.8f\n", x3_f, y3_f);
			System.out.printf("%.8f %.8f\n", x3_2, y3_2);
			//System.out.printf("%.8f %.8f\n",   x2,   y2);
		}else{
			KochCurve(deep + 1, n, x1, y1, x3_1, y3_1);
			KochCurve(deep + 1, n, x3_1, y3_1, x3_f, y3_f);
			KochCurve(deep + 1, n, x3_f, y3_f, x3_2, y3_2);
			KochCurve(deep + 1, n, x3_2, y3_2, x2, y2);
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		if(n == 0){
			System.out.printf("%.8f %.8f\n", 0.0, 0.0);
		}else{
			KochCurve(0, n, 0, 0, 100, 0);
		}
		System.out.printf("%.8f %.8f\n", 100.0, 0.0);
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
	    
	    public long nextLong() throws IOException {
	    	return Long.parseLong(next());
	    }
	    
	    public void close() throws IOException {
	        br.close();
	    }
	}

}