import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		while(true){
			int a		= sc.nextInt();
			String op	= sc.next();
			int b		= sc.nextInt();
			
			if ( "?".equals(op) ) {
				break;
			}

			int calcRes = 0;
			if ( "+".equals(op) ) {
				calcRes = a+b;

			} else if ( "-".equals(op) ) {
				calcRes = a-b;

			} else if ( "*".equals(op) ) {
				calcRes = a*b;

			} else if ( "/".equals(op) ) {
				calcRes = a/b;

			}

			System.out.println( calcRes );
		}
		
	}
}