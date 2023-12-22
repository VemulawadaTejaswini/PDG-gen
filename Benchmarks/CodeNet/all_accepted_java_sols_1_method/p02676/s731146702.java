import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String s = sc.next();
		int s_length = s.length();
		String dots = "...";
		String ans = "";
		if (k >= s_length) {
			System.out.println(s);
		} else {
			ans = s.substring(0,k);
			ans = ans.concat(dots);
			System.out.println(ans);
		}
		sc.close();


	}

}