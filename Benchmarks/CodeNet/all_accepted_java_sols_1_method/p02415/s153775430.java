import java.util.Scanner;

public class Main {
	public static void main(String srgs[]) {
		String str;
		String ans = "";
		int l, i;
		char c;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		l = str.length();
		for (i = 0; i < l; ++i) {
			c = str.charAt(i);
			if (c >= 'a' && c <= 'z') {
				c = Character.toUpperCase(c);
			} else {
				c = Character.toLowerCase(c);
			}
			ans = ans + c;
		}
		System.out.println(ans);
		sc.close();
	}

}
