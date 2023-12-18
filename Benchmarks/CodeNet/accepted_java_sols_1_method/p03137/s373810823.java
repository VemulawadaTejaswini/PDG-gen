import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		int[] x = new int[m];

		for(int i = 0; i < m; i++) {
			x[i] = scan.nextInt();
		}
		scan.close();

		Arrays.sort(x);

		int[] d = new int[m]; //座標間の距離のリスト
		for(int i = 1; i < m; i++) {
			d[i] = x[i] - x[i-1];
		}

		Arrays.sort(d);

		int ans = 0;

		for(int i = 0; i < m-n; i++) {
			ans+=d[i+1];
		}

		System.out.println(ans);


	}

}