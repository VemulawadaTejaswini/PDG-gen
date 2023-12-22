import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		int k = sc.nextInt();


		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(k-1) != s.charAt(i)) {
				s = s.replace(s.charAt(i), '*');
			}
		}

		System.out.println(s);
	}

}