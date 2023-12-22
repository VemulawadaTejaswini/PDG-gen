import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int startNum; // 標準入力から受け取る整数A
		int endNum; // 標準入力から受け取る整数B
		int answer = 0; // 回分数の個数
		Scanner sc = new Scanner(System.in);
		startNum = sc.nextInt();
		endNum = sc.nextInt();
		// 整数Aを初期値とするiの値が整数Bに達するまで繰り返す。
		for (int i = startNum; i <= endNum; i++) {
			String numStr = String.valueOf(i);
			char num1 = numStr.charAt(0); // 1文字目
			char num2 = numStr.charAt(1); // 2文字目
			char num4 = numStr.charAt(3); // 4文字目
			char num5 = numStr.charAt(4); // 5文字目
			//回分数かどうか判定
			if ((num1 == num5) && (num2 == num4)) {
				answer++;
			}
		}
		System.out.println(answer);

	}
}