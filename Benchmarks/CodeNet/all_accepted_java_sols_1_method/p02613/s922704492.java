import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		int N = scan.nextInt();

		String[] S = new String[N];


		//WK変数
		int AC = 0;
		int WA = 0;
		int TLE = 0;
		int RE = 0;

		//演算
		for (int i = 0; i < N; i++) {
			S[i] = scan.next();
			if (S[i].equals("AC")) {
				AC++;
			} else if (S[i].equals("WA")) {
				WA++;
			} else if (S[i].equals("TLE")) {
				TLE++;
			} else if (S[i].equals("RE")) {
				RE++;
			}
		}

		//結果出力
		System.out.println("AC x " + AC);
		System.out.println("WA x " + WA);
		System.out.println("TLE x " + TLE);
		System.out.println("RE x " + RE);
	}
}