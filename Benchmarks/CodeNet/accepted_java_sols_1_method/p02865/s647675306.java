import java.util.Scanner;

// https://atcoder.jp/contests/abc140/tasks/abc140_b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		int ans = 0;

		for(int i=1;i<=N/2;i++) {
			if(i!=(N-i)) {
				ans = ans + 1;
			}
		}


		System.out.println(ans);

	}
}
