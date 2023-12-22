import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String w = sc.next();
		sc.close();
		int[]k = new int[26];
		for(int i = 0; i < w.length(); i++) {
			int t = (int)w.charAt(i) - 'a';
			k[t]++;
		}
		boolean flag = true;
		for(int i = 0; i < 26; i++) {
			if(k[i] % 2 != 0) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}