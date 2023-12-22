import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		long n = in.nextLong();
		long k = in.nextLong();
		long r = n % k;
		r = Math.min(r, Math.abs(k - r));
		System.out.println(r);
		in.close();
	}
}