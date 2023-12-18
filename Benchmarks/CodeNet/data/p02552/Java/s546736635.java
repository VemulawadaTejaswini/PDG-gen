import java.util.Scanner;

// 提出時にclass Main に書き換え
public class Main {
	public static void main(String[] args)  {
		// 標準入力を受け取る
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); // int xを受け取る
		sc.close(); // 標準入力を終了

		if (x == 0) {
			// xが0
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

}