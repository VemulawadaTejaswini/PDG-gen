import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		//数取得
		int X = sc.nextInt();
		sc.close();

		if(X >= 30) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
