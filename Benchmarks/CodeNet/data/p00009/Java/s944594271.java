import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		int datasetNum = 10;
		int[] primeNumber = new int[datasetNum];
		boolean judge = false;

		for(int i = 0; i < datasetNum; i++) {

			int number = stdin.nextInt();
			for(int j = 2; j <= number; j++) {
				if(j % 2 == 0 && j / 2 != 1)
					continue;
				for(int k = 3; k <= j - 1; k += 2) {

					if(j % k == 0) {

						judge = true;
						break;
					}
				}

				if(judge == false) {
					primeNumber[i]++;
				}
				judge = false;
			}

		}

		for(int i = 0; i < datasetNum; i++) {
			System.out.println(primeNumber[i]);
		}

	}
}