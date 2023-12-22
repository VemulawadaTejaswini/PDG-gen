import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		sc.close();
		String rs = String.valueOf(s);
		StringBuffer sb = new StringBuffer(rs);
		String asdf = sb.reverse().toString();
		char[] asdf2 = asdf.toCharArray();
		int wa = 0;
		int num = rs.length();
		for (int i = 0; i < num; i++) {
			if (s[i] != asdf2[i]) {
				wa++;
			}
		}
		if(wa%2==0) {
			wa=wa/2;
		}
		System.out.println(wa);
	}
}
