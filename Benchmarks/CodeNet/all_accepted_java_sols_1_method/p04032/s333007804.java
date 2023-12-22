import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int N = s.length();
		char[] c = s.toCharArray();
		int a = 0;
		int b = 0;
		for (int i=1;i<N;i++) {
			if (c[i]==c[i-1]) {
				System.out.println(i + " " + (i+1));
				return;
			}
		}

		for (int i=2;i<N;i++) {
			if (c[i]==c[i-2]) {
				System.out.println((i-1) + " " + (i+1));
				return;
			}
		}

		System.out.println(-1 + " " + -1);
	}
}