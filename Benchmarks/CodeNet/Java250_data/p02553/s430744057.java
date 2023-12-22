import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		
		long max1 = b * d;
		long max2 = a * c;
		long max3 = a * d;
		long max4 = b * c;
		
		System.out.println(Math.max(Math.max(max1, max2), Math.max(max3, max4)));
	}
}
