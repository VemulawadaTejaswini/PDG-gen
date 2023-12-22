import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();

		long t1 = (n / (a + b)) * a;
		long t2 = n % (a + b) > a ? a : n % (a + b);

		sc.close();
			System.out.println(t1 + t2);


	}

}
