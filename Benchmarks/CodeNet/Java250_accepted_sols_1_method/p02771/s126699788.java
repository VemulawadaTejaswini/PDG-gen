

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner  =new Scanner(System.in);
		String ans  ="No";

		int a  =scanner.nextInt();
		int b  =scanner.nextInt();
		int c  =scanner.nextInt();

		if(a==b || a==c || b==c) {
			ans = "Yes";
		}
		if(a==b && b==c) {
			ans = "No";
		}

		System.out.println(ans);

		scanner.close();

	}

}
