import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		long c = scan.nextLong();
		long d = scan.nextLong();
		scan.close();



		long max1 =a*c;
		long max2 =a*d;

		long max3 =b*c;
		long max4 =b*d;

		long max = Math.max(Math.max(max1,max2),Math.max(max3, max4));

		System.out.println(max);
	}
}