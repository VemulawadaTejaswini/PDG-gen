import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] data = input.split(" ");
		int a = Integer.parseInt(data[0]);
		int b = Integer.parseInt(data[1]);
		int c = Integer.parseInt(data[2]);

		if ((0 <= a && a <= 100) && (0 <= b && b <= 100)
				&& (0 <= c && c <= 100)) {
			if ((a < b) && (b < c)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}

