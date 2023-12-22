import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sca = new Scanner(System.in);
		int x1 = sca.nextInt();
		int x2 = sca.nextInt();
		int x3 = sca.nextInt();
		if((x1 + x2 + x3) >= 22) {
			System.out.println("bust");
		}
		else {
			System.out.println("win");
		}

	}
}
