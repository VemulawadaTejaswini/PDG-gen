import java.util.Scanner;

// https://atcoder.jp/contests/abc156/tasks/abc156_c
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int[] arrayB = new int[m];
		for(int i=0;i<m;i++) {
			arrayB[i] = sc.nextInt();
		}

		int ans = 0;
		for(int i=0;i<n;i++) {
			int tmp = c;
			for(int j=0;j<m;j++) {
				int a = sc.nextInt();
				tmp = tmp + arrayB[j]*a;
			}
			if(tmp>0) {
				ans++;
			}
		}
		sc.close();
		System.out.println(ans);
	}
}
