import java.util.Scanner;

public class Main {

	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			// 文字列の入力
			if(a==b && b==c) {
				System.out.println("Yes");
			} else {
			// 出力
  				System.out.println("No");
			}
	}
}