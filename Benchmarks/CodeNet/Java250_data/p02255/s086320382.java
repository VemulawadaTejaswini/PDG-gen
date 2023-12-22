import java.util.Scanner;

class Main {

	public static void main(String[] a) {
		// 入力
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result[] = new int[n];
		for (int i = 0; i < result.length; i++) {
			result[i] = sc.nextInt();
		}
		sc.close();

		// 出力
		for (int j2 = 0; j2 < result.length; j2++) {
			System.out.print(result[j2]);
			if (j2 < result.length - 1) {
				System.out.print(" ");
			} else {
				System.out.println();
			}
		}
		for (int i = 1; i < result.length; i++) {
			int keep = result[i];
			int j = i - 1;
			while (j >= 0 && keep < result[j]) {
				result[j + 1] = result[j];
				j--;
				result[j + 1] = keep;
			}
			for (int j2 = 0; j2 < result.length; j2++) {
				System.out.print(result[j2]);
				if (j2 < result.length - 1) {
					System.out.print(" ");
				} else {
					System.out.println();
				}
			}
		}
	}
}