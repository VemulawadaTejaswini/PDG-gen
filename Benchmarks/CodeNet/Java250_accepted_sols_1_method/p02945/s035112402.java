
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if( (A+B) >= (A-B) ) {
			if( (A+B) >= (A*B) ) {
				System.out.print(A+B);
			} else if( (A+B) < (A*B) ) {
				System.out.print(A*B);
			}
		} else if ( (A+B) <= (A-B) ) {
			if( (A-B) >= (A*B) ) {
				System.out.print(A-B);
			} else if( (A-B) < (A*B) ) {
				System.out.print(A*B);
			}
		}
	}

}