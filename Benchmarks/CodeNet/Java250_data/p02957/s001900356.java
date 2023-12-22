import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner		scan	=	new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();



		scan.close();

		if((a + b) % 2 == 0) {
			int k = (a + b) / 2;
			System.out.println(k);
		} else {
			System.out.println("IMPOSSIBLE");
		}

		scan.close();

	}


}