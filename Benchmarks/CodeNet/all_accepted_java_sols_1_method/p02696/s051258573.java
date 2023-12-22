import java.io.*;
import java.math.*;
import java.util.*;
public class Main{

	public static void main(String[] args) {
		long mod = (long)(1e9+7);
		Scanner input = new Scanner(System.in);
		long A = input.nextLong();
		long B = input.nextLong();
		long N = input.nextLong();
		if (B==1) System.out.println(0);
		else {
			long max = A*N/B-N/B*A;
			for (long x = B-1; x <= N; x+=B) {
				long factor = x/B;
				long cur = A*x/B-factor*A;
				max = Math.max(max, cur);
			}
			System.out.println(max);
		}
	}
}