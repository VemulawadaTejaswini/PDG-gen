import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b = sc.nextDouble();
		long ib = (long) (b * 100 + 0.5);
		a *= ib;
		a /= 100;
		System.out.println(a);
		
		sc.close();
	}
}


