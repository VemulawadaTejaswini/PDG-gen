import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		double B = sc.nextDouble();

		Long N = (long)Math.floor(A*B);
		System.out.println(N);
		
		
		sc.close();
	}
}
