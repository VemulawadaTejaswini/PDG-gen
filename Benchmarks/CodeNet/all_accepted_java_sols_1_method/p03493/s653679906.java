import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String s1 = sc.nextLine();
		if (s1.equals("000")) {
			System.out.println(0);
		} else if (s1.equals("001") || s1.equals("010") || s1.equals("100")) {
			System.out.println(1);
		} else if (s1.equals("011") || s1.equals("101") || s1.equals("110")) {
			System.out.println(2);
		} else {
			System.out.println(3);
		}

	}

}
