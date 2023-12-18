
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		
		int c = 0;
		for(int i=0; i < a; i++) {
			int b = sc.nextInt();
			b *= b;
			c = b;
		}
		if (c >= 999999999999999999L) {
			c = -1;
		}

		// 出力
		System.out.println(c);
	}

}