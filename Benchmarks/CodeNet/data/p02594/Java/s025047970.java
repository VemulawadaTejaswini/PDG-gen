import java.util.Scanner;

// 提出時にclass Main に書き換え
public class Main {
	public static void main(String[] args)  {
		// 標準入力を受け取る
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(); // int Nを受け取る
		sc.close(); // 標準入力を終了

		if (X >= 30) {
			// 冷房ON
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}