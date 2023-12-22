import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		//入力表示
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		int S = 6 - A - B; 
			

		System.out.println(S);

		scanner.close();
	}
}