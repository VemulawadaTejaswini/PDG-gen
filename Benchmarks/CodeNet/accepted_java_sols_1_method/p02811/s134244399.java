import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();
		int j = sc.nextInt();
		if(500 * i >= j) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
