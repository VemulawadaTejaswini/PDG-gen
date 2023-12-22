import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int num = 0;
		for(int i = 0; i < n ; i++) {
			int pre[] = new int[26];
			int suf[] = new int[26];
			for (int j = 0; j < i; j++) {
				pre[(int)s.charAt(j) - (int)'a'] = 1;
			}
			for(int j = i; j < n; j++) {
				suf[(int)s.charAt(j) - (int)'a'] = 1;
			}
			int rec = 0;

			for (int j = 0; j < 26; j++) {
				if(pre[j] == 1 && suf[j] == 1) {
					rec++;
				}
			}
			num = Math.max(num, rec);
		}
		System.out.println(num);

	}

}
