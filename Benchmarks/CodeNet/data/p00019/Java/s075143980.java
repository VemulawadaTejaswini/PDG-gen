import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		System.out.println(fact(n));
	}
	static long fact(long n) {
		if(n == 1) return 1;
		return n * fact(n - 1);
	}
}
