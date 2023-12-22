import java.util.Scanner;

// https://atcoder.jp/contests/abc165/tasks/abc165_b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		sc.close();



		int ans = 1;
		long a = 100L;
		for(int i=1;a<x;i++) {
			a = (long) (a*1.01);
			ans = i;
		}
		System.out.println(ans);
	}
}
