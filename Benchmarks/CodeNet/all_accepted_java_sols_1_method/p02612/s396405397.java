

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int oturi = n % 1000;

		if (oturi != 0) {
			oturi = 1000 - oturi;
		}

		System.out.println(oturi);

	}

}