
import java.util.Scanner;

public class Main {

	/*
	 * 1 から n までの数の中から、重複無しで３つの数を選びそれらの合計が x となる組み合わせの数を求めるプログラムを作成して下さい。
	 * 
	 * 例えば、1 から 5 までの数から３つを選んでそれらの合計が 9 となる組み合わせは、
	 * 
	 * 1 + 3 + 5 = 9 2 + 3 + 4 = 9 の２通りがあります。
	 * 
	 * Input 複数のデータセットが入力として与えられます。各データセットでは、空白で区切られた n、x が 1 行に与えられます。
	 * 
	 * n、x がともに 0 のとき入力の終わりとします。
	 * 
	 * n は 3 以上 100　以下とします。
	 * 
	 * Output 各データセットについて、組み合わせの数を１行に出力して下さい。
	 */
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		while (true) {

			int count = 0;
			int n = sc.nextInt();
			int x = sc.nextInt();

			if (n == 0 && x == 0) {

				break;

			} else {

				for (int i = 1; i <= n; i++) {
					for (int j = i + 1; j <= n; j++) {
						for (int j2 = j + 1; j2 <= n; j2++) {
							if (i + j + j2 == x) {
								count++;
							}
						}
					}
				}
				System.out.println(count);
			}

		}
		sc.close();

	}
}