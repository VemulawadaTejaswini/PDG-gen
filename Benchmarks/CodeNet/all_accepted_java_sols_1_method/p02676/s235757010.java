import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		//数取得
		int K = sc.nextInt();
		String S = sc.next();
		sc.close();

		if(S.length() <= K) {
			System.out.println(S);
		}else {
			String answer = S.substring(0, K);
			System.out.println(answer + "...");
		}
	}

}
