import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();

		String[] resultArray = S.split("");//[2]

		for (int i = 0; i < K - 1; i++) {

			System.out.print(resultArray[i]);
		}

		System.out.print(resultArray[K-1].toLowerCase());

		for (int i = K ; i < N; i++) {

			System.out.print(resultArray[i]);
		}

		sc.close();
	}

}