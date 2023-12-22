import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		long K = Long.parseLong(sc.next());
		for(int i = 0; i < S.length(); i++) {
			if(!S.substring(i, i + 1).equals("1") || i == K - 1) {
				System.out.println(S.substring(i, i + 1));
				return;
			}
		}
		System.out.println(1);
	}
}
