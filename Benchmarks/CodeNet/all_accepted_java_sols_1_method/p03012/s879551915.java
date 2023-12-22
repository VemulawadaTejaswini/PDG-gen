import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] W = new int[N];

		int sumAll = 0;
		for (int i = 0; i < N; i++) {
			W[i] = sc.nextInt();
			sumAll += W[i];
		}

		int answer = 0;
		int id = 0;
		for (int i = 0; i < N; i++) {
			answer += W[i];
			id = i;
			if (answer > sumAll / 2.0)
				break;
		}
		if (Math.abs(sumAll - 2 * answer) > Math.abs(sumAll - 2 * (answer - W[id])))
			System.out.println(Math.abs(sumAll - 2 * (answer - W[id])));
		else
			System.out.println(Math.abs(sumAll - 2 * answer));
		sc.close();
	}
}
