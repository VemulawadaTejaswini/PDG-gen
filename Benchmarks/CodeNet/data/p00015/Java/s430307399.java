import java.io.*;
import java.math.*;
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		long n = Integer.valueOf(r.readLine());
		outer: for(long i = 0; i < n; i++) {
			int count = 0;
			BigInteger sum = BigInteger.ZERO;
			while(count++ < 2) {
				String in = r.readLine();
				if(in == null) break outer;
				if(in.length() > 80) {
					System.out.println("overflow");
					break outer;
				}
				sum = sum.add(new BigInteger(in));
				if(sum.toString().length() > 80) {
					System.out.println("overflow");
					break outer;
				}
			}
			System.out.println(sum);
		}
	}
}