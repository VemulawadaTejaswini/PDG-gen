import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		// 入力を受け取るためのクラスを利用するための準備
		Scanner sc = new Scanner(System.in);
		
		String w = sc.next();
		String t;
		int cnt = 0;
		while(true) {
			t = sc.next();
			if (t.equals("END_OF_TEXT")) break;
			
			// 大文字小文字を区別せずに2つの文字列を比較
			if (t.equalsIgnoreCase(w)) cnt++;
		}
		System.out.println(cnt);

	}

}

