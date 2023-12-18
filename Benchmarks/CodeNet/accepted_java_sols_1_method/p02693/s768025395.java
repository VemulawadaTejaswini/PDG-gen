import java.util.Scanner;

// https://atcoder.jp/contests/abc165/tasks/abc165_a
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();


		for(int i=a;i<=b;i++) {
			if(i%k==0) {
				System.out.println("OK");
				return;
			}
		}
		System.out.println("NG");


	}
}
