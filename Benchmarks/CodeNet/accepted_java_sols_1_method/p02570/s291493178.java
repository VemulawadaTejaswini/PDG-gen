import java.util.Scanner;

// 提出時にclass Main に書き換え
public class Main {
	public static void main(String[] args)  {
		// 標準入力を受け取る
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt(); // int Dを受け取る
		int T = sc.nextInt(); // int Tを受け取る
		int S = sc.nextInt(); // int Sを受け取る
		sc.close(); // 標準入力を終了

		// S * T >= D なら、時間内に目的地に到着する
		if(S * T >= D) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}


	}

}