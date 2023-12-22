
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long all = a + b;
		long wari = n / all;
		wari = wari * a;
		long amari = n % all;
		long hasuu = a > amari ? amari : a;
		System.out.println(wari + hasuu);

		sc.close();
	}

}
