
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long div = n / (a + b);
		long mod = n % (a + b);
		long ans = div * a + ((mod < a) ? mod : a);
		System.out.println(ans);
	}
}
