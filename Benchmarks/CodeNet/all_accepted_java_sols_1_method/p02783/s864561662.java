import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
		
		//入力表示
		int H = scanner.nextInt();
		int A = scanner.nextInt();
		
		//攻撃計算
		System.out.println((H+A-1)/A);
		 
		scanner.close();
	}
}