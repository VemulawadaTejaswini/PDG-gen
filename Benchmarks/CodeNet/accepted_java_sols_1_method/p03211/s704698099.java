import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int niceNumber = 0;
		for(int i = 0 ; i <= s.length() - 3 ; i++) {
			String s2 = s.substring(i, i + 3);
			int t = Integer.valueOf(s2);
			niceNumber = Math.abs(niceNumber - 753) > Math.abs(t - 753) ? t : niceNumber;
		}
		System.out.println(Math.abs(niceNumber - 753));

	}
}

