import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		long n = Long.parseLong(str[0]);
		long a = Long.parseLong(str[1]);
		long b = Long.parseLong(str[2]);

		long x = n / (a + b);
		long min = Math.min(n % (a + b), a);
		System.out.println(x * a + min);
	}
}
