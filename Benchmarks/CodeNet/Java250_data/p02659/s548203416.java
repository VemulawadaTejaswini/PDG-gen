
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long a = scan.nextLong();
		double b = scan.nextDouble();
		double b2 = Math.round(b*100);

		long re = (long)b2;


		System.out.println((long)(a*re)/100);

		scan.close();

	}

}
