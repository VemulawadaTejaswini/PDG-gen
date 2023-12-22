import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		//数取得
		int N = sc.nextInt();
		int D = sc.nextInt();

		int answer = 0;

		for(int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
			//System.out.println(distance);

			if(distance <= D) {
				answer++;
			}
		}

		System.out.println(answer);
	}

}
