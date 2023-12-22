import java.util.Scanner;

// 提出時にclass Main に書き換え
public class Main {
	public static void main(String[] args)  {
		// 標準入力を受け取る
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // int Aを受け取る
		int B = sc.nextInt(); // int Bを受け取る
		int C = sc.nextInt(); // int Cを受け取る
		int X = sc.nextInt(); // int Xを受け取る
		sc.close(); // 標準入力を終了

		int x = 0; // 合計金額をX円にする方法の数

		for(int a = 0; a <= A; a++) {
			for(int b = 0; b <= B; b++) {
				for(int c = 0; c <= C; c++) {
					if(500*a + 100*b + 50*c == X) {
						// 合計金額がX円にする方法
						x += 1;
					}
				}
			}
		}

		// xを出力
		System.out.println(x);
	}

}