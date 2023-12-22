import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		char[] s = sc.next().toCharArray();
		int cnt = 0;
		int max = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == 'A' || s[i] == 'T' || s[i] == 'C' || s[i] == 'G') {
				cnt++;
				max = Math.max(max, cnt);
			} else {
				cnt = 0;
			}
		}
		System.out.println(max);
	}
}