import java.util.Scanner;

class Main {

	public static void main(String[] a) {
		// 入力
		Scanner sc = new Scanner(System.in);
		int result[] = new int[10];
		for (int i = 0; i < 10; i++) {
			result[i] = sc.nextInt();
		}
		sc.close();

		// 出力
		for (int i = 0; i < 3; i++) {
			int maxIndex = i;
			for (int j = i + 1; j < result.length; j++) {
				if (result[maxIndex] < result[j]) {
					maxIndex = j;
				}
			}
			System.out.println(result[maxIndex]);
			result[maxIndex] = 0;/*
			if (i < 2) {
				System.out.println();
			}*/
		}
	}
}