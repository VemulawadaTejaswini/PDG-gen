import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		//入力の読み込み処理
		Scanner sc = new Scanner(System.in);
		double R = sc.nextInt();

		//計算結果の表示
		System.out.print(2 * R * 3.14);
	}
}