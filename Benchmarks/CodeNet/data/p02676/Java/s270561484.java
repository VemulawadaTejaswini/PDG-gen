

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int K = scan.nextInt();
		String S = scan.next();
		if(S.length()<=K) {
			System.out.println(S);
		}else if(S.length()>K) {
			String ans = S.substring(0,K);
			System.out.println(ans+"...");
		}

	}

}
