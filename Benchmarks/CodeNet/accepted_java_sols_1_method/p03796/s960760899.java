import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long mod = 1000000007;
		long power = 1;
		for (int i = 1; i <= n; i++) {
			power = power * i % mod;
		}
		System.out.println(power);
	}
}