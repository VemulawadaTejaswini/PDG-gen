import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);

		int x = in.nextInt();
		int y = in.nextInt();

		int m = 2*x;
		m = y - m;
		if(m % 2 == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
