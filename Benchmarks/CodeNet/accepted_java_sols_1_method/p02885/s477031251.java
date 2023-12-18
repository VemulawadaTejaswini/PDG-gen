import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		//入力表示
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int ans = 0;
		ans = b * 2 - a ;

	
		if (a <= b*2) {
			System.out.println(0);
		} else {
			System.out.println( Math.abs(ans));
		}
    }
}