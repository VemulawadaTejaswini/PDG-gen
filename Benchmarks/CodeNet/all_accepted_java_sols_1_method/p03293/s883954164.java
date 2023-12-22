import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();
		boolean flag = false;

		for (int i = 0; i < s.length(); i++) {

			flag = s.equals(t);
			if (flag)
				break;

			char e;
			String tmp;
			e = s.charAt(s.length() - 1);
			tmp = s.substring(0, s.length() - 1);
			s = e + tmp;

		}

		if (flag)
			System.out.println("Yes");
		else
			System.out.println("No");
		sc.close();
	}

}
