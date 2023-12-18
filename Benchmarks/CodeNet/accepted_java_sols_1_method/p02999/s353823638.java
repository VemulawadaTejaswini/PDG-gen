import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 電源タップの口数
		int X = sc.nextInt();
		// 余った電源タップ
		int A = sc.nextInt();
		//タップの個数
		sc.close();

		if(X<A) {
			System.out.println(0);
		}else {
			System.out.println(10);
		}
		}

}