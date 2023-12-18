

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 201; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			int n = a + b;
			int cnt = 1;
			while (n != 0) {
				n = n / 10;
				cnt++;
			}
			System.out.println(cnt - 1);

		}
	}

}