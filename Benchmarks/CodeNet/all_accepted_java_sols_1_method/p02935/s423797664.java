import java.util.Arrays;
import java.util.Scanner;

// https://atcoder.jp/contests/abc138/tasks/abc138_c
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] arrayV = new int[N];
		for(int i=0;i<arrayV.length;i++) {
			arrayV[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(arrayV);

		double ans = arrayV[0];

		for(int i = 1;i<N;i++) {
			ans = (ans + arrayV[i])/2;

		}

		System.out.println(ans);

	}
}
