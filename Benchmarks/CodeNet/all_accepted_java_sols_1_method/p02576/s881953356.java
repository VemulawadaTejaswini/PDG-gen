import java.util.Scanner;

// 提出時にclass Main に書き換え
public class Main {
	public static void main(String[] args)  {
		// 標準入力を受け取る
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // int Nを受け取る
		int X = sc.nextInt(); // int Xを受け取る
		int T = sc.nextInt(); // int Tを受け取る
		sc.close(); // 標準入力を終了

		int a = 0; // タコ焼き機を使う回数
		if(N <= X) {
			a = 1;
		} else if(N % X != 0) {
			a = N / X + 1;
		}else {
			a = N / X;
		}

		System.out.println(a * T);
	}

}