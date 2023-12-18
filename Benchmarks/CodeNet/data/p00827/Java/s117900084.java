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
			int a = sc.nextInt();
			int b = sc.nextInt();
			int d = sc.nextInt();
			if(a == 0 && b == 0 && d == 0) break;
			int minWeight = INF;
			int minNumber = INF;
			int ansX = -1;
			int ansY = -1;
			for(int i = 0; i <= 50000; i++) {
				for(int j = 0; j < 50000; j++) {
					if(i + j > minNumber) break;
					if(a * i + b * j > minWeight) break;
					if(Math.abs(a * i - b * j) == d || (a * i + b * j) == d) {
						minWeight = a * i + b * j;
						minNumber = i + j;
						ansX = i;
						ansY = j;
					}
				}
			}
			System.out.println(ansX + " " + ansY);
		}
	}
}