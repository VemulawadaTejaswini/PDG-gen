import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long a = scan.nextLong();
		long b = scan.nextLong();
		long x = scan.nextLong();

		long a1 = a / x;
		long b1 = b / x;

		long aa = a % x;
		long bb = b % x;


		long ab=b1 - a1;

		if(aa==0) {
			ab=ab+1;
		}

		System.out.println(ab);
	}

}