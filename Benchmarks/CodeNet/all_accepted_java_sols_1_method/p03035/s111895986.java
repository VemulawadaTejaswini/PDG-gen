import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int price = 0;

		if (a >= 13) {
			price = b;
		} else if (a >= 6 && a <= 12) {
			price = b / 2;
		}else {
			price = 0;
		}
		System.out.println(price);

	}

}