import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] intArr = new int[n];
		for (int i = 0; i < n; i++) {
			intArr[i] = sc.nextInt();
		}

		int sum = 0;
		for (int j = 0; j < n - 1; j++) {
			
			// 前の人の方が高かったら処理
			if (intArr[j] > intArr[j + 1]) {
				int max = intArr[j];
				int min = intArr[j + 1];
				intArr[j + 1] = max;
				sum += max - min;
			}
			
		}

		System.out.println(sum);
	}
}