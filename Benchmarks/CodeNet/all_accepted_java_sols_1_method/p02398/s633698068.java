import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {

		Scanner scanner = new Scanner( System.in );

		ArrayList<Integer> nums = new ArrayList<Integer>();

		int a = Integer.parseInt( scanner.next() );
		int b = Integer.parseInt( scanner.next() );
		int c = Integer.parseInt( scanner.next() );

		for ( int i = 1; i <= c; i++ ) {
			if ( c % i == 0 ) {
				nums.add( i );
			}
		}

		int count = 0;
		for ( int num : nums ) {
			if ( num >= a && num <= b ) {
				count++;
			}
		}

		System.out.println( count );

		scanner.close();
	}
}