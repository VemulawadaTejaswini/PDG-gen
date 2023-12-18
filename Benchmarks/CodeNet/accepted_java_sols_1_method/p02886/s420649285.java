import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		//入力表示
		int N = scanner.nextInt();

		//配列に箱を作る
		int[] d = new int[N];
		int A = 0;
		
		//d表示をする
		for (int i = 0; i < N; i++) {
			d[i] = scanner.nextInt();
		}
        //Aの中にi.jを入れる
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				A = A + d[i] * d[j];
			}
		}
		System.out.println(A);
	}
}