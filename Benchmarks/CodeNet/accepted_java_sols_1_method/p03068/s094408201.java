import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String S = sc.next();
		int K = Integer.parseInt(sc.next());
		String s = S.substring(K - 1, K);
		for(int i = 0; i < S.length(); i++) {
			if(S.substring(i, i + 1).equals(s)) {
				System.out.print(s);
			} else {
				System.out.print("*");
			}
		}
		System.out.println();
	}
}
