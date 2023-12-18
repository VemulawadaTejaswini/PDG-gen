import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int A = sc.nextInt();
		int B = sc.nextInt();
		int T = sc.nextInt();

		int count = T/A ;
		int sum = 0 ;
		for(int i = 0 ; i < count ; i ++) {
			sum += B ;
		}

		// 出力
		System.out.println(sum);

	}

}
