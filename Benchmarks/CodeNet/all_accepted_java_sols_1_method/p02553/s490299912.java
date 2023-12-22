import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		long a = scan.nextLong();
		long b = scan.nextLong();
		long c = scan.nextLong();
		long d = scan.nextLong();


		long num1 = a * c;
		long num2 = a * d;
		long num3 = b * c;
		long num4 = b * d;

		long result = num1;

		if (result <= num2) {
			result = num2;
		}
		if (result <= num3) {
			result = num3;
		}
		if (result <= num4) {
			result = num4;
		}



		//結果出力
		System.out.println(result);
	}
}