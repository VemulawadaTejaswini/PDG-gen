

import java.util.Scanner;

public class Main {

	static int N = 123456;

	public static void main(String[] args) {

		boolean[] primeNumber = new boolean[2 * N + 1];
		primeNumber[1] = true;
		for (int i = 4; i <= 2 * N; i += 2)
			primeNumber[i] = true;

		for (int i = 3; i <= 2*N; i += 2)
			for (int j = 2; j <= 2*N/i; j++)
				primeNumber[i * j] = true;

		Scanner sr = new Scanner(System.in);

		while (true) {
			int count = 0;
			int n = sr.nextInt();
			if(n == 0) break;
			for(int i = n+1; i <= 2*n; i++)
				if(primeNumber[i] == false) count++;


			System.out.println(count);


		}

	}
}

