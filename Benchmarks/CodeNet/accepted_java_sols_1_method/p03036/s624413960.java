import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner  = new Scanner(System.in);
		final int r = scanner.nextInt();
		final int D = scanner.nextInt();
		int x = scanner.nextInt();
		for(int i = 0; i < 10; i++) {
			x =  r * x - D;
			System.out.println(x);
		}
		scanner.close();
	}

}
