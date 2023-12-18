
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int T = 0;
		int H = 0;

		for (int i = 0; i < N; i++) {
			String Taro = sc.next();
			String Hana = sc.next();

			if (Taro.compareTo(Hana) == 0) {
				T++;
				H++;
//.compareToで比べる時、左の値が大きい場合には正の値、右の値の方が大きければ負の値がでる
			} else if (Taro.compareTo(Hana) > 0) {
				T += 3;
			} else {
				H += 3;
			}

		}
		System.out.println(T + " " + H);
	}
}

