import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		long A = scan.nextLong();
		long B = scan.nextLong();
		long tmp = (N / (A + B));
		long rem = N - tmp * (A + B);
		long ans = tmp * A + Math.min(A, rem);
		System.out.println(ans);
	}
}
