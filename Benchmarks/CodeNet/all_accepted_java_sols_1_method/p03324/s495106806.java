import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int d = scanner.nextInt();
		int n = scanner.nextInt();
		if(n == 100) {
			switch (d) {
			case 0:
				System.out.println(101);
				break;

			case 1:
				System.out.println(10100);
				break;
				
			case 2:
				System.out.println(1010000);
				break;
			}
		}else {
			System.out.println(n*(int)Math.pow(100, d));
		}
	}

}