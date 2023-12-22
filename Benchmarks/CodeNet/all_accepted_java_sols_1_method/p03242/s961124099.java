import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		//入力表示		
		String n = sc.next();
		char[] a = n.toCharArray();

		for (int i = 0; i < 3; i++) {
			if (a[i] == '1') {
				a[i] = '9';
			} else {
				a[i] = '1';
			}
		}
		System.out.println(String.valueOf(a));
	}
}