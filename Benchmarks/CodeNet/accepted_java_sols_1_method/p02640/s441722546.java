import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		int X = sc.nextInt();
		int Y = sc.nextInt();
	

		if (Y % 2 == 0 && X * 2 <= Y && Y <= X * 4) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}