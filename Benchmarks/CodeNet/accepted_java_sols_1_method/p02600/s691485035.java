import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		//数取得
		int X = sc.nextInt();
		sc.close();

		int answer = 0;

		if(X <= 599) {
			answer = 8;
		}else if(X <= 799) {
			answer = 7;
		}else if(X <= 999) {
			answer = 6;
		}else if(X <= 1199) {
			answer = 5;
		}else if(X <= 1399) {
			answer = 4;
		}else if(X <= 1599) {
			answer = 3;
		}else if(X <= 1799) {
			answer = 2;
		}else if(X <= 1999) {
			answer = 1;
		}

		System.out.println(answer);
	}

}
