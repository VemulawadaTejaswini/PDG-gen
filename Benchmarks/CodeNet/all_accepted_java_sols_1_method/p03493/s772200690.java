import java.util.Scanner;

// 提出時にclass Main に書き換え
public class Main {
	public static void main(String[] args)  {
		// 標準入力を受け取る
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine(); // String sを受け取る
		sc.close(); // 標準入力を終了

		String s2 = s.replace("0", ""); // 0を空白に置き換え

		// 残った1の個数を出力
		System.out.println(s2.length());
	}

}