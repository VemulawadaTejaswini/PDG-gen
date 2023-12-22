import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String w = sc.next().toUpperCase();
		sc.close();
		int[] alp = new int[26];
		for(int i = 0;i < w.length();i++) {
			char c = w.charAt(i);
			alp[c - 65]++;
		}
		String ans = "Yes";
		for(int i = 0;i < alp.length;i++) {
			if(alp[i]%2 != 0) {
				ans = "No";
				break;
			}
		}
		System.out.println(ans);
	}
}