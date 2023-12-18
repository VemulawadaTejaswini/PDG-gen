import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		long a, b;
		while ((input = br.readLine()) != null) {
			String[] arr  = input.split(" ");
			a = Integer.parseInt(arr[0]);
			b = Integer.parseInt(arr[1]);
			System.out.println(gcd(a, b) + " " + lcm(a, b));
		}
	}
	private static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
	private static long lcm(long a, long b) {
		return a * b / gcd(a, b);
	}
}