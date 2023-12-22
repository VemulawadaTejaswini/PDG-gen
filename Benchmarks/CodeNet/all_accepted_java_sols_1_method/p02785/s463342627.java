import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] h = new int[n];

		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}

		//配列h小さい順にソートする。
		Arrays.sort(h);

		//配列hの要素のうち小さいものn-k個の合計値を求める。
		long sum = 0;
		for (int i = 0; i < n - k; i++) {
			sum += h[i];
		}

		System.out.println(sum);
	}

}
