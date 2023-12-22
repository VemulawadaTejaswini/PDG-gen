import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		int count = 0;

		for (int i = 0; i < str.length()/2; i++) {
			char a = str.charAt(i);
			char b = str.charAt(str.length() - i - 1);
			if (a != b)
				count++;

		}
		System.out.println(count);
		sc.close();

	}

}
