import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String s = "";
		String p = "";
		String searched_line = "";
		boolean judge = false;
		int count = 0; // 一致している文字数をカウントするための変数

		s = sc.nextLine();
		p = sc.nextLine();

		if (p.length() >= 1 && s.length() >= p.length() && s.length() <= 100) {

			searched_line = s + s.substring(0, p.length() - 1);

			out: for (int i = 0; i < s.length(); i++) {
				count = 0;
				if (("" + searched_line.charAt(i)).equals("" + p.charAt(0))) { // if1
					count++;
					in: for (int j = 1; j < p.length(); j++) {
						if (("" + searched_line.charAt(i + j)).equals("" // if2
								+ p.charAt(j)) == false) {
							break in;
						}// if2ここまで
						count++;
					}// in: for文ここまで

					if (count == p.length()) { // if3
						judge = true;
						break out;
					}// if3ここまで

				} // if1ここまで

			}// out:for文ここまで

			if (judge == true) {
				System.out.println("Yes");

			} else {
				System.out.println("No");
			}

		}

	}

}

