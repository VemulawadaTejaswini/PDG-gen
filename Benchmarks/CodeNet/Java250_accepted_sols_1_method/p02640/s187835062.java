

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double x = sc.nextInt();
		double y = sc.nextInt();
		sc.close();



		if(y > x * 4 || y < x * 2) {
			System.out.println("No");
		}else {
			for(int i=0; i<=100; i++) {
				if( ( y - 2 * x )/2 == i ) {
					System.out.println("Yes");
					return;
				}
			}
			System.out.println("No");
		}




	}

}
