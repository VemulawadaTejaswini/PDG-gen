import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		//入力表示
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int D = scanner.nextInt();

		int X = (A + D - 1) / D;
		int Y = (C + B - 1) / B;

		String ans= X >= Y ? "Yes" : "No";
		System.out.println(ans);
	}

}
