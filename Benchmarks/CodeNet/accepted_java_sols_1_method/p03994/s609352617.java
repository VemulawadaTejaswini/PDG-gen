import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int n = s.length;
		int k = sc.nextInt();
		for(int i=0;i<n-1;i++) {
			if (s[i] == 'a') continue;
			if (k >= 'z' + 1 - s[i]) {
				k -= 'z' + 1 - s[i];
				s[i] = 'a';
			}
		}
		int last = s[n-1] - 'a';
		last = (last + k) % 26;
		s[n-1] = (char) ('a' + last);
		System.out.println(s);
	}

}
