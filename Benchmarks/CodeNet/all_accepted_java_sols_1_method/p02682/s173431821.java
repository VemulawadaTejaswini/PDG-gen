import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();

		int tmp_a = a;
		int tmp_b = b;
		int tmp_c = c;

		int ans = 0;
		sc.close();

		for (int i = 0; i < tmp_a; i++) {
			if (k == 0 || a == 0) {
				break;
			} else {
				ans ++;
				k --;
				a --;
			}
		}


		for (int i = 0; i < tmp_b; i++) {
			if (k == 0 || b == 0) {
				break;
			} else {
				k --;
				b --;
			}
		}


		for (int i = 0; i < tmp_c; i++) {
			if (k == 0 || c == 0) {
				break;
			} else {
				ans --;
				k --;
				c --;
			}
		}
		System.out.println(ans);


	}

}