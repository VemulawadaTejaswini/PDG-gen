import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] a = new int[n], b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);

		int mid = n / 2;
		if (n % 2 == 0) { // .5も含む
//			double min = (a[mid - 1] + a[mid]) / 2;
//			double max = (b[mid - 1] + b[mid]) / 2;
//			System.out.println((int) (max - min) * 2 + 1); // (max-min+1)*2-1
			
			// 整数で扱っても結果は変わらない．
			int min = (a[mid - 1] + a[mid]) / 2;
			int max = (b[mid - 1] + b[mid]) / 2;
			System.out.println((max - min) * 2 + 1);
		} else {
			// 整数値のみ
			System.out.println(b[mid] - a[mid] + 1);
		}
	}
}
