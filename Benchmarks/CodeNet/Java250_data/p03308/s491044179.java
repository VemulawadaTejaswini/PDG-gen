import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();
		int[] a = new int[n];

		for ( int i = 0 ; i < n ; i++ ) {
			a[i] = sc1.nextInt();
		}

		Arrays.sort(a);

		int min = a[0];
		int max = a[n-1];

		int ans = max - min;

		System.out.println(ans);

		sc1.close();

	}

}