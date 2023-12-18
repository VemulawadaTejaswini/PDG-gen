import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt() % 10;
		String b = "";
		// 出力
		if (a == 2
				|| a == 4
				|| a == 5
				|| a == 7
				|| a == 9) {

			b = "hon";

		} else if (a == 0
				|| a == 1
				|| a == 6
				|| a == 8) {

			b = "pon";

		} else if (a == 3) {

			b = "bon";

		}
		System.out.println(b);
	}
}