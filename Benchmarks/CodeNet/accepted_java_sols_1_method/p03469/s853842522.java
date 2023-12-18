import java.util.*;

// ABC 54-D
// https://beta.atcoder.jp/contests/abc054/tasks/abc054_d

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		char[] s = in.next().toCharArray();
		System.out.printf("2018");
		for (int i = 4; i < s.length; i++) {
			System.out.printf("%c", s[i]);
		}
		System.out.println();
	}
}