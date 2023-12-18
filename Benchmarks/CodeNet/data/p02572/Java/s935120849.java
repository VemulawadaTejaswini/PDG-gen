import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] number = new long[n];
		for (int i = 0; i < n; i++) {
			number[i] = sc.nextInt();
		}

		int DIVNUM = (int) (Math.pow(10, 9) + 7);
		long divResult = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				divResult += (number[i] * number[j]) % DIVNUM;
			}
		}

		System.out.println(divResult % DIVNUM);

		sc.close();

	}

}
