import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int x = scanner.nextInt();
		for(int i = a; i <a + x; i++) {
			if(i > b) continue;
			System.out.println(i);
		}
		for(int r = b - x + 1; r < b + 1; r++) {
			// 範囲がかぶってたらbreak
			if(r < a + x || r < a) continue;
			
			System.out.println(r);
		}
	}

}
