import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;

		int chair[][] = new int[n][2];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < 2; j++) {
				chair[i][j] = sc.nextInt();
			}

			count += chair[i][1] - chair[i][0] + 1;
		}
		System.out.println(count);

	}

}
