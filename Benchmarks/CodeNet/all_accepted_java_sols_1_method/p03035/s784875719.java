import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		
		if ( 13 <= A ) {
			System.out.println(B);
		} else if (A <= 5){
			System.out.println(0);
		} else {
			System.out.println(B/2);
		}

		

		in.close();
	}
}