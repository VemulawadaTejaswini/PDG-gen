import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int result = 0;

		while(x >= 500) {
			x -= 500;
			result += 1000;
		}

		while(x >= 5) {
			x -= 5;
			result += 5;
		}

		System.out.println(result);
	}

}
