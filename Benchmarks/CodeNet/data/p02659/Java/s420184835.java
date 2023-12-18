import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		float b = sc.nextFloat();
		long res = 0;
		
		long bx100 = (long) (b * 100);
		long tmp = a * bx100;
		res = tmp / 100;
		
		System.out.printf("%d", res);
	}
}
