

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count = 0; //約数の数
		int count2 = 0;

		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=i ; j++) {
				if(i % 2 == 1 && i % j == 0) {
					count ++;
				}
			}
			if(count == 8) {
				count2++;
			}
			count = 0;
		}

		System.out.println(count2);


		sc.close();

	}

}
