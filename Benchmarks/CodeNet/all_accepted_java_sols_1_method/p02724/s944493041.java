import java.util.Scanner;

// https://atcoder.jp/contests/abc160/tasks/abc1160_b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		sc.close();


		int[] array = {1000,100,50,10,5,0};
		int[] money = {500,100,50,10,5,1};
		int ans = 0;

		for(int i=0;i<money.length;i++) {
			int tmp = s/money[i];
			s = s - tmp*money[i];
			ans = ans + tmp*array[i];
		}

		System.out.println(ans);


	}
}
