import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		//入力表示

		int T =sc.nextInt();
		int X = sc.nextInt();
		
		double ans=(double)T/X;
			System.out.printf("%.10f",ans);
	}
}