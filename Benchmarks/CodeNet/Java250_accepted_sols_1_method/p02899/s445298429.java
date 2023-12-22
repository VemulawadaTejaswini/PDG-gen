import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Nの入力
		int N = sc.nextInt();
		
		// 配列のAi番目にiを格納
		String[] array = new String[N];
		for (int i = 0; i < N; i++) {
			int Ai = sc.nextInt();
			array[Ai-1] = Integer.toString(i+1);
		}
		
		// 結果の出力
		System.out.println(String.join(" ", array));
		
		sc.close();
	}
}
