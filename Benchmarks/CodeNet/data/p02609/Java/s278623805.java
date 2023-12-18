import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	//java11

//	static int[] fn;
	static Map<Long, Long> fn;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String X = sc.next();

//		fn = new int[(int)Math.pow(2, N)];
//		fn = new int[10000000];
		fn = new HashMap<>();
//		Arrays.fill(fn, -1);

		PrintWriter pw = new PrintWriter(System.out);
		for(int i=0; i<N; i++) {
			StringBuilder sb = new StringBuilder(X);
			//bit反転
			if(X.charAt(i) == '0') {
				sb.setCharAt(i, '1');
			}else {
				sb.setCharAt(i, '0');
			}

			long Xi = Long.parseLong(sb.toString(), 2);

			pw.println(fn(Xi));

		}

		pw.flush();

	}

	public static long fn(long n) {
		if(fn.get(n) != null) {
			return fn.get(n);
		}

		if(n == 0) {
//			fn[n] = 0;
			fn.put(n, 0L);
			return fn.get(n);
		}


		fn.put(n, fn(n % popcount(n)) + 1);
		return fn.get(n);
	}

	public static long popcount(long n) {
		return Long.bitCount(n);
	}

}
