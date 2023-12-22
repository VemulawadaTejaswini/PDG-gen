

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		scan.close();

		//D=25 なら Christmas, D=24 なら Christmas Eve, D=23 なら Christmas Eve Eve, D=22 なら Christmas Eve Eve Eve
		if(N==25) {
			System.out.println("Christmas");
		}
		if(N==24) {
			System.out.println("Christmas Eve");
		}
		if(N==23) {
			System.out.println("Christmas Eve Eve");
		}
		if(N==22) {
			System.out.println("Christmas Eve Eve Eve");
		}
	}

}