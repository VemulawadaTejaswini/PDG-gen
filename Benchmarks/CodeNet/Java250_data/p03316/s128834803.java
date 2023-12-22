import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n, m, sn = 0;
		n = sc.nextLong();
		m = n;
		while(m > 0) {
			sn += m % 10;
			m /= 10;
		}
		System.out.println(n % sn == 0 ? "Yes" : "No");
	}
}