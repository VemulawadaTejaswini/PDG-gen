import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] data = input.split(" ");
		int a = Integer.parseInt(data[0]);
		int b = Integer.parseInt(data[1]);

		if (a >= -1000 && b <= 1000) {
			if (a > b) {
				System.out.println("a > b");
			} else if (a < b) {
				System.out.println("a < b");
			} else {
				System.out.println("a == b");
			}
		}

	}

}

