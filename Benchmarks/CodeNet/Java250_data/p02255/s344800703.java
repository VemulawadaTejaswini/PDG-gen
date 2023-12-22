import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 標準入力から数列と整数N（数列の長さ）を読み込み
		int n = Integer.parseInt(scanner.nextLine());    // 数列の長さ
		String[] array = scanner.nextLine().split(" ");  // 数列
		
		// 初期状態の配列状態を出力
		System.out.println(String.join(" ", array));
		
		for (int i = 1; i < n; i++) {
			int v = Integer.parseInt(array[i]);
			int j = i - 1;
			while(j >= 0 && Integer.parseInt(array[j]) > v) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = Integer.toString(v);
			
			// 途中経過の配列状態を出力
			System.out.println(String.join(" ", array));
		}
		
		scanner.close();
	}
}

