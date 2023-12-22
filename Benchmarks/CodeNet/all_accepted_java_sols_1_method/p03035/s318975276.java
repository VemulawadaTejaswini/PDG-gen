import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int A = sc.nextInt();
		int B = sc.nextInt();

		int yen = 0 ;
		if(13 <= A) {
			yen = B ;
		}else if(6 <= A && A <= 12) {
			yen = B/2 ;
		}

		// 出力
		System.out.println(yen);

	}

}
