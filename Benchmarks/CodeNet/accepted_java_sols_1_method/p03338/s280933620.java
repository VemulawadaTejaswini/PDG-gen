import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		char[] c = new char[n];
		int[] count = new int[n];
		int a = 'a';
		int max = 0;
		for (int i = 0; i < n; i++) {
				c[i] = s.charAt(i);
		}
		for (int i = 1; i < n; i++) {
			boolean[] xmemo = new boolean[26];
			boolean[] ymemo = new boolean[26];
			for (int j = 0; j < i; j++) {
				xmemo[c[j]-a] = true;
			}
			for (int k = i; k < n; k++) {
				ymemo[c[k]-a] = true; 
			}
			for (int l = 0; l < 26; l++) {
				if (xmemo[l] && ymemo[l])	 count[i]++;
			}
		}
		for (int i = 0; i < n; i++) {
			if (count[i] > max) {
				max = count[i];
			}
		}
		System.out.println(max);
	}
}
