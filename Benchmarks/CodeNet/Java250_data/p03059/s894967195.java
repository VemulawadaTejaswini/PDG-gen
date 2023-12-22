import java.util.Scanner;

public class Main {


public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int A = sc.nextInt();
			int B = sc.nextInt();
			int T = sc.nextInt();

			int count = 0;

			if( A > T ) {
				count = 0;
				System.out.println(count);
			}
			if( A == T ) {
				count = B;
				System.out.println(count);
			}
			if( A < T ){
				count = B * (T / A);
				System.out.println(count);
			}
		}

	}