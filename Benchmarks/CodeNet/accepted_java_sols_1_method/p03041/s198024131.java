import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int K = sc.nextInt();
		String ABC = sc.next();

		String newS = "" ;
		for(int i = 1 ; i < N + 1; i ++) {
			char c = ABC.charAt(i - 1);
			if( i == K) {
				c = ("" + c).toLowerCase().charAt(0);
			}
			newS = newS + c ;
		}
		// 出力
		System.out.println(newS);

	}

}