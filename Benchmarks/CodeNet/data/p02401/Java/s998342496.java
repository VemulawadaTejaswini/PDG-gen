import java.util.Scanner;

public class simple_calculator {

	public static void main(String[] args) {

		//
		Scanner sc = new Scanner(System.in);
		String out = "";

		// 演算子の変数に入っている中身で場合わけ
		while (true) {
			
			int a = sc.nextInt();
			String operator = sc.next();
			int b = sc.nextInt();
			
			if (operator.equals("?")) {
				break;
			}
			switch (operator) {

			case ("/"):
				out = out + a / b + "\n";
				break;

			case ("*"):
				out = out + a * b + "\n";
				break;

			case ("+"):
				out = out + (a + b) + "\n";
				break;

			case ("-"):
				out = out + (a - b) + "\n";
				break;
			}
		}
		// 出力
		System.out.println(out);
	}
}