import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		char s[] = sc.next().toCharArray();
		int cnt = 0;
		char start = s[0];
		for (int i = 1; i < s.length; i++) {
			if (s[i] != start) {
				cnt++;
				start = s[i];
			}
		}
		System.out.println(cnt);
	}
}
