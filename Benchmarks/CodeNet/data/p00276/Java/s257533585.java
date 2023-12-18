import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		final int Q = sc.nextInt();
		
		for(int q = 0; q < Q; q++){
			final int c = sc.nextInt();
			final int a = sc.nextInt();
			final int n = sc.nextInt();
			
			int count = 0;
			
			final int min_n = Math.min(c, Math.min(a, n));
			
			count += min_n;
			
			final int c_ = c - min_n;
			final int a_ = a - min_n;
			//System.out.println(c_ + " " + a_);
			
			final int min_a = Math.min(c_ / 2, a_);
			
			count += min_a;
			
			final int c__ = c_ - min_a * 2;
			
			count += c__ / 3;
			
			System.out.println(count);
			
			
		}
	}

}