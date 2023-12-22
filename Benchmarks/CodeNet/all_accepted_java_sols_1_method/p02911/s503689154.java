import java.util.Arrays;
import java.util.Scanner;
public class Main {

//全員、「初期ポイント-問題数」してから、正解した人に「+1」する！

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int participants = sc.nextInt();
		int point = sc.nextInt();
		int questions = sc.nextInt();

		//正解した人の番号を入力
		int winner[] = new int[questions];
		for(int i=0 ; i<winner.length ; i++) {
			winner[i] = sc.nextInt();
		}

		//全員の初期ポイントを「ポイント－問題数」にする
		int result[] = new int[participants];
		Arrays.fill(result, point-questions);

		//正解した人にだけ「+1ポイント」する
		for(int i=0 ; i<questions ; i++) {
			result[winner[i]-1]++;
		}

		//result[]の値が0より大きいか判断
		for(int i : result) {
			System.out.println(i>0 ? "Yes" : "No");
		}
		sc.close();
	}
}
