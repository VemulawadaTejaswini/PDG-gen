import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		String s = sc.next();
		String t = sc.next();

		String result = "";
		for (int i = 0; i < n; i++) {
			result = result + s.charAt(i) + t.charAt(i);
		}

		System.out.println(result);
	}

}