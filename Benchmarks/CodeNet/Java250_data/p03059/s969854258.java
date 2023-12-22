import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	private static final boolean TEST = false;

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int a = in.nextInt();
		int b = in.nextInt();
		int t = in.nextInt();
		System.out.println(solve(a, b, t));
		in.close();
	}

	private static int solve(int a, int b, int t) {
		return (t / a) * b;
	}
}
