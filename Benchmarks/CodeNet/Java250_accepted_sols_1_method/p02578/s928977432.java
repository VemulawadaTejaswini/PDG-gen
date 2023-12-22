import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		long answer = 0;

		try {

			int N = sc.nextInt();
			int max = 0;

			for(int i = 0; i < N; i++) {
				int t = sc.nextInt();
				//既出の最大値の方が大きいとき
				if(max >= t) {
					//最大値更新せず
				}else {
					//最大値更新
					max = t ;
				}
				//最大値との差が必要な高さ
				answer += max - t;
			}

		}finally {
			sc.close();
			System.out.println(answer);
		}
	}

}
