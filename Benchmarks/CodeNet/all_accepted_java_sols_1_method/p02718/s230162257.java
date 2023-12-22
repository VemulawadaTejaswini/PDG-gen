import java.util.Arrays;
import java.util.Scanner;

// https://atcoder.jp/contests/abc161/tasks/abc161_b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] array = new int[n];
		double sum = 0.0;
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
			sum = sum + array[i];
		}
		sc.close();


		double flag = 1.0/4.0/m;
		Arrays.sort(array);

		boolean ans = true;

		for(int i=0;i<m;i++) {
			if(array[n-1-i]/sum<flag) {
				ans = false;
			}else {

			}
		}

		if(ans) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
