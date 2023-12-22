import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		String[] s = S.split("");
		String[] t = T.split("");
		int[] start = new int[26];
		int[] goal = new int[26];
		for (i = 0; i < 26; i++) {
			start[i] = -1;
			goal[i] = -1;
		}
		for (i = 0; i < s.length; i++) {
			 char[] x = s[i].toCharArray();
			 char[] y = t[i].toCharArray();
			 int a = x[0] - 'a';
			 int b = y[0] - 'a';

			 if (start[a] != -1 || goal[b] != -1) {
				 if (start[a] != b || goal[b] != a) {
					 System.out.println("No");
					 return;
				 }
			 }

			 start[a] = b;
			 goal[b] = a;
		}
		System.out.println("Yes");
	}
}