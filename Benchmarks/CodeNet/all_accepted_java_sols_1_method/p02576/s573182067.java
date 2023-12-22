import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int T = sc.nextInt();

		int answer = 0;

		if(N % X == 0) {
			answer = (N / X) * T;
		}else {
			answer = (N / X + 1) * T;
		}

		System.out.println(answer);
	}

}
