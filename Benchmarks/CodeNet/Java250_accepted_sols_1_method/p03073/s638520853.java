import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		int ans = s.length();

		for (int i = 0; i < 2; i++) {

			int cnt = 0;

			for (int j = 0; j < s.length(); j++) {
				if(j % 2 == 0 && s.charAt(j) != (char)(i + '0')) cnt++;
				if(j % 2 == 1 && s.charAt(j) == (char)(i + '0')) cnt++;
			}

			ans = Math.min(ans, cnt);
		}

		System.out.println(ans);
	}

}