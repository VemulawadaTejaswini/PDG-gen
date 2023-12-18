import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {

		Scanner scanner = new Scanner( System.in );

		long	a = Long.parseLong( scanner.next() );
		int 	b = Integer.parseInt( scanner.next() );

		int x = (int)(a / b);
		int y = (int) (a % b);
		double z = a / (double)b;

		System.out.println( x + " " + y + " " + z);
		scanner.close();
	}
}