import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();
		int a = sc1.nextInt();
		int b = sc1.nextInt();
		int p[] = new int[n];
		int test[] = new int[3];
		test[0] =0;
		test[1] =0;
		test[2] =0;

		for ( int i = 0 ; i < n ; i++ ) {
			p[i] = sc1.nextInt();
			if ( p[i] <= a) {
				test[0]++;
			}
			else if ( p[i] > a && p[i]<= b) {
				test[1]++;
			}
			else {
				test[2]++;
			}
		}

		Arrays.sort(test);

		System.out.println(test[0]);

		sc1.close();

	}

}