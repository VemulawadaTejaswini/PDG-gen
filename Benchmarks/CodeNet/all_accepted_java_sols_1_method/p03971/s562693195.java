import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		String S = sc.next();
		int cnt_a = 0;
		int cnt_b = 0;
		for(int i = 0; i < S.length(); i++) {
			String s = S.substring(i, i + 1);
			if(s.equals("a")) {
				if(cnt_a + cnt_b < A + B) {
					cnt_a++;
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			} else if(s.equals("b")) {
				if(cnt_a + cnt_b < A + B && cnt_b < B) {
					cnt_b++;
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			} else {
				System.out.println("No");
			}
		}
	}
}
