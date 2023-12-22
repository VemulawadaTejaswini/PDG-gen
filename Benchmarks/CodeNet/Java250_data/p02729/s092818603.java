import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int cnt = 0;

		for(int i = 1; i < N; i++) {
			cnt = cnt + N - i;
		}

		for(int i = 1; i < M; i++) {
			cnt = cnt + M - i;
		}

		System.out.println(cnt);
	}

}