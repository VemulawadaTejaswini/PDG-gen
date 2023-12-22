import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		switch (a) {
		case 25:
		    System.out.println("Christmas");
		    break;
		case 24:
			System.out.println("Christmas Eve");
		    break;
		case 23:
			System.out.println("Christmas Eve Eve");
		    break;
		case 22:
			System.out.println("Christmas Eve Eve Eve");
		    break;
		default:
		    // 式の値がどのcaseの値とも一致しなかったときの処理
		}
		
	}
}
