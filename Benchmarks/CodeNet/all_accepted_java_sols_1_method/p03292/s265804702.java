import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);
		int a = sc1.nextInt();
		int b = sc1.nextInt();
		int c = sc1.nextInt();
		int temp = 0;
		int ans = 0;

		//123
		ans += Math.abs(b-a);
		ans += Math.abs(c-b);

		//132
		temp += Math.abs(c-a);
		temp += Math.abs(b-c);
		if (ans > temp) {
			ans = temp;
		}

		//213
		temp = 0;
		temp += Math.abs(a-b);
		temp += Math.abs(c-a);
		if (ans > temp) {
			ans = temp;
		}


		//231
		temp = 0;
		temp += Math.abs(c-b);
		temp += Math.abs(a-c);
		if (ans > temp) {
			ans = temp;
		}

		//312
		temp = 0;
		temp += Math.abs(a-c);
		temp += Math.abs(b-a);
		if (ans > temp) {
			ans = temp;
		}

		//321
		temp = 0;
		temp += Math.abs(b-c);
		temp += Math.abs(a-b);
		if (ans > temp) {
			ans = temp;
		}


		System.out.println(ans);

		sc1.close();

	}

}