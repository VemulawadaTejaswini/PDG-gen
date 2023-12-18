import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] data = input.split(" ");
		int a = Integer.parseInt(data[0]);
		int b = Integer.parseInt(data[1]);
		int area = 0;
		int length = 0;

		if (a >= 1 && b <= 100) {
			area = a * b;
			length = (a + b) * 2;
			System.out.println(area + " " + length);

		}

	}

}

