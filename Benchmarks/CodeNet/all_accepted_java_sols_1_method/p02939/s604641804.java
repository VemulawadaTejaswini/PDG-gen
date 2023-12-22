import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		char[] s = sc.next().toCharArray();
		//a,aa,c,ca,c,a,b,a,ab,a,b,c
		int cnt = 1;
		char tmp = s[0];
		for (int i = 1; i < s.length; i++) {
			if (tmp == s[i]) {
				tmp = 'A';
				i++;
				if(i != s.length) {
					cnt++;
				}
			} else {
				cnt++;
				tmp = s[i];
			}
		}
		System.out.println(cnt);
	}
}