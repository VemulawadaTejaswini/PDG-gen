
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		//数取得
		int N = sc.nextInt(); //N学期
		int K = sc.nextInt(); //K番目の学期

		ArrayList<Integer> score = new ArrayList<>();

		for(int i = 0; i < N; i++) {
			score.add(sc.nextInt());
		}

		sc.close();

		for(int i = 0; i < N-K; i++) {
			if(score.get(i) < score.get(K+i)) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}

}
