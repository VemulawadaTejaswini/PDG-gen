import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); //次の1行を読み取る
		int n = str.length();
		char[] c = str.toCharArray();

		for(int i = 0; i < n; i++) {
			if(65 <= (int)c[i] && (int)c[i] <= 90) {  //大文字の場合
				System.out.print((char)((int)c[i] + 32));
			}
			else if(97 <= (int)c[i] && (int)c[i] <= 122) {  //小文字の場合
				System.out.print((char)((int)c[i] - 32));
			}
			else System.out.print(c[i]);
		}
		System.out.println();
	}
}
