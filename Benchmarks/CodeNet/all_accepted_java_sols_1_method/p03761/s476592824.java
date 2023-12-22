import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int [n][26];
		for (int i=0;i<n;i++) {
			String s = sc.next();
			for (int j=0;j<s.length();j++) {
				a[i][s.charAt(j)-'a']++;
			}
		}
		StringBuffer sb = new StringBuffer();
		for (int i=0;i<26;i++) {
			int min = a[0][i];
			for (int j=1;j<n;j++) {
				if (min>a[j][i]) {
					min = a[j][i];
				}
			}
			if (min >0) {
				for (int j=0;j<min;j++) {
					sb.append((char)('a'+i));
				}
			}
		}
		System.out.println(sb.toString());
	}
}