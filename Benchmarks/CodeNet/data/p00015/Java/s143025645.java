import java.io.*;
import java.math.*;
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(r.readLine());
		outer: while(true) {
			int count = 0;
			BigInteger sum = BigInteger.ZERO;
			while(count < n) {
				String in = r.readLine();
				if(in == null) break outer;
				sum = sum.add(new BigInteger(in));
				count++;
			}
			System.out.println(sum);
		}
	}
}