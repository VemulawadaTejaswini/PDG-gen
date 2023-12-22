import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { //Look for adjacent outliers first
		Scanner input = new Scanner(System.in);
		long N = input.nextLong();
		int ans = Integer.MAX_VALUE;
		for (long i = 1; i <= Math.sqrt(N); i++) {
			if (N%i==0) {
				long BigFactor = N/i;
				ans = Math.min(ans, Long.toString(BigFactor).length());
			}
		}
		System.out.println(ans);
	}
}