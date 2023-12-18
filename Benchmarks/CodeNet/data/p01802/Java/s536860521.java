import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.util.Calendar.Builder;



public class Main {
	static int INF = 2 << 27;
	static int N;
	static int M;
	static int A;
	static int B;
	static int C;
	static int T;
	static long[][] dp;
	public static void main(String[] args) {	
		//FastScanner sc = new FastScanner();
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		while(true) {
			int d = sc.nextInt();
			int e = sc.nextInt();
			if(d == 0 && e == 0) break;
			double min = INF;
			for(int i = 0; i <= d; i++) {
				int j = d - i;
				min = Math.min(Math.abs(Math.sqrt(i * i + j * j) - e),min);
			}
			System.out.printf("%.10f\n",min);
		}
	}
}