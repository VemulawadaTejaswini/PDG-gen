import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			long a = sc.nextLong();
			long b = sc.nextLong();
			long k = sc.nextLong();
			
			if ( a >= k ) {
				System.out.println( (a-k) + " " + b);
			}
			else {
				k = k - a;
				if ( b >= k ) {
					System.out.println( 0 + " " + (b-k));
				}
				else {
					System.out.println("0 0");
				}
			}
		}
	}
}