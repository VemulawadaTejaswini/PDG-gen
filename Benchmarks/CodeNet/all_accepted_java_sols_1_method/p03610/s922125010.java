import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		for (int i = 0; i < s.length(); i++) {
			if(i % 2 == 0)
				System.out.print(s.charAt(i));
		}
	}

}