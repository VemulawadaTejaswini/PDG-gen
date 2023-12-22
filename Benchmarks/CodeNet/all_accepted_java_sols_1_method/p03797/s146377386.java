import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		if (m % 2 == 1) {
			m--;
		}
		if (n >= m / 2) {
			System.out.println(m / 2);
		} else {
			m -= 2 * n;
			System.out.println(n + m / 4);
		}
	}
}