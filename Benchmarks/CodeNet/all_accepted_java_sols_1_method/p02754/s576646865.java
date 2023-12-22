import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		long blue = (n / (a + b)) * a + Math.min(a, (n % (a + b)));
		System.out.println(blue);
		sc.close();
	}
}
