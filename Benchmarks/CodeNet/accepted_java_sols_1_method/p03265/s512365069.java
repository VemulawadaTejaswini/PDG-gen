import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int x1 = sc1.nextInt();
		int y1 = sc1.nextInt();
		int x2 = sc1.nextInt();
		int y2 = sc1.nextInt();

		int x3 = x2 - (y2 - y1);
		int y3 = y2 + (x2 - x1);
		int x4 = x3 - (y3 - y2);
		int y4 = y3 + (x3 - x2);

		System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);

		sc1.close();

	}

}