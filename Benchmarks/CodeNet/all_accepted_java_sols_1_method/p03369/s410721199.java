import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();
		int price = 700;

		for (int i = 0; i < 3; i++) {
			//文字列Sを1文字ずつに分解し、listに追加
			String s = S.substring(i,i+1);

			//もし、"o"であれば、priceにプラス100
			if (s.equals("o")) {
				price += 100;
			}
		}
		System.out.println(price);
	}
}