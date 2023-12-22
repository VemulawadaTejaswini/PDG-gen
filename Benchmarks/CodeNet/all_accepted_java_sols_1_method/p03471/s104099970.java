import java.util.Scanner;

//提出時にclass Main に書き換え
public class Main {
	public static void main(String[] args)  {
		// 標準入力を受け取る
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // int Nを受け取る
		int Y = sc.nextInt(); // int Yを受け取る
		sc.close(); // 標準入力を終了

		for(int a = 0; a <= N; a++) {
			// 10000円札の枚数
			for(int b = 0; b <= N - a; b++) {
				// 5000円札の枚数

				int c = N - a - b; // 1000円札の枚数

				if(10000*a + 5000*b + 1000*c == Y) {
					// 合計金額がY円になるなら、各金額の札の枚数の組を出力
					System.out.println(a + " " + b + " " + c);
					return; // プログラムを終了
				}
			}
		}

		// 合計金額がY円になる組み合わせが無い場合、-1 -1 -1を出力
		System.out.println(-1 + " " + -1 + " " + -1);
	}

}