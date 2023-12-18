import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		int k = sc.nextInt() - 1;
		for (int i = 0; i < n; i++) {
			if (s[i] != s[k]) {
				s[i] = '*';
			}
		}
		System.out.println(s);
	}
}
