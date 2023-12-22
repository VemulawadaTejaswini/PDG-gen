

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int answer = 0;
		int max5 = 90000;
		int max3 = 900;
		int max1 = 9;

		if (n >= 10000) {
			if (n > 99999)
				answer += max5;
			else
				answer += n - 9999;

		}
		if (n >= 100) {
			if (n > 999)
				answer += max3;
			else
				answer += n - 99;
		}

		if (n >= 10)
			answer += max1;
		else
			answer += n;

		System.out.println(answer);

	}

}
