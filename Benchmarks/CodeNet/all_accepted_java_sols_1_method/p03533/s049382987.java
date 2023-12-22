import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		StringBuilder sb = new StringBuilder(s);
		String akb = "AKIHABARA";
		if(n > 9) {
			System.out.println("NO");
			return;
		}
		for(int i = 0 ; i < 9 ; i++) {
			if(sb.length() > i && sb.charAt(i) == akb.charAt(i)) continue;
			sb.insert(i, "A");
			if(sb.charAt(i) != akb.charAt(i)) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
