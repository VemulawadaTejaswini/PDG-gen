import java. util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		String s = scan.next();
		char[] c = s.toCharArray();
		int a = (int)c[0];
		if(65<=a&&a<=90) {
			System.out.println("A");
		}else {
			System.out.println("a");
		}

	}

}
