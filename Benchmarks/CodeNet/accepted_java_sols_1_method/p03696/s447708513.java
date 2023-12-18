import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String S = sc.next();
		String S2 = new String(S);
		int cnt = 0;
		while(S2.contains("()")) {
			S2 = S2.replace("()", "");
		}
		StringBuilder ans = new StringBuilder(S);
		for(int i = 0; i < S2.length(); i++) {
			if(S2.substring(i, i + 1).equals(")")) {
				ans.insert(0, "(");
			} else {
				ans.append(")");
			}
		}
		System.out.println(ans.toString());
	}
}
