import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	void run() {
		Scanner scan = new Scanner(System.in);
		char[] str;
		char[] temp = new char[200];
		int m, len;
		int[] h = new int[200];
		
		while (true) {
			// 入力
			str = scan.next().toCharArray();
			len = str.length; if (len == 1 && str[0] == '-') break;
			m = scan.nextInt();
			for (int i = 0; i < m; i++) h[i] = scan.nextInt();

			
			// シャッフル
			for (int i = 0; i < m; i++) {
				for (int j = h[i], k = 0; j < len; j++, k++) temp[k] = str[j];
				for (int j = 0, k = len-h[i]; j < h[i]; j++, k++) temp[k] = str[j];
				for (int j = 0; j < len; j++) str[j] = temp[j];
			}
			
			// 出力
			for (int i = 0; i < len; i++) System.out.print(str[i]);
			System.out.println();
		}
	}
}

