import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		/**
		if(a == b) {
			System.out.println(a + b);
		}else {
			int res = Math.max(a, b) * 2 -1;
			System.out.println(res);
		}
		**/

		int ans = 0;
		ans = Math.max(ans, a + a -1);
		ans = Math.max(ans, a + b);
		ans = Math.max(ans, b + b -1);

		System.out.println(ans);


	}

}