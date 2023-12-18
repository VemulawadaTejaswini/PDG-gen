import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		//数取得
		String alfa = sc.next();
		sc.close();

		char answer = 'A';

		for(char a = 'a'; a <= 'z'; a++) {
			if(alfa.charAt(0) == a) {
				answer = 'a';
			}
		}

		System.out.println(answer);
	}

}
