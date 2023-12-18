import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {

		Scanner scanner = new Scanner( System.in );

		long	a = Long.parseLong( scanner.next() );
		int 	b = Integer.parseInt( scanner.next() );

		int x = (int)(a / b);
		int y = (int) (a % b);
		float z = (float)a / b;

		System.out.println( String.format( x + " " + y + " " + "%1$f", z));
		scanner.close();
	}
}