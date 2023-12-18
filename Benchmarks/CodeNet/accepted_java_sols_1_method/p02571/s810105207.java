import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next(), t = sc.next();
		int r = s.length();
		for (int i=0;i<=s.length()-t.length();i++) {
			String a = s.substring(i, t.length()+i);
			int tmp = 0;
			for (int j=0;j<a.length();j++) {
				if (a.charAt(j) != t.charAt(j)) {
					tmp++;
				}
			}
			r = Math.min(tmp, r);
		}
		System.out.println(r);
	}
}
