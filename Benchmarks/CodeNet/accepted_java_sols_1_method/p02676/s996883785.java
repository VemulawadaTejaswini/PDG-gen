import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		String S = sc.next();

		if(S.length() <= K) {
			System.out.println(S);
		}else {
			System.out.println(S.substring(0, K) + "...");
		}
	}
}