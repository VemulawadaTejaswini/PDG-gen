import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();//整数の数
		int n[] = new int[num];//配列

		//配列の格納
		for (int i = 0; i < n.length; i++) {
			int x = sc.nextInt();//格納する数字
			n[i] = x;

		}

		//逆順に出力
		for (int i = n.length - 1; i >= 0; i--) {

			if (i != 0) {
				System.out.print(n[i] + " ");
			} else {
				System.out.println(n[i]);
			}

		}
	}
}

