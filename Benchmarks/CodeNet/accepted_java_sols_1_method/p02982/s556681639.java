import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int D = sc.nextInt();

		int[][] inputArray = new int[N][D];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < D; j++) {
				inputArray[i][j] = sc.nextInt();
			}
		}

		int count = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				int sum = 0;
				for (int k = 0; k < D; k++) {
					sum += Math.pow(Math.abs(inputArray[i][k] - inputArray[j][k]), 2);
				}
				if(Math.floor(Math.sqrt(sum)) == Math.sqrt(sum)) {
					count++;
				}
			}
		}


		System.out.println(count);
		sc.close();
	}

}
