

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();

		int a[] = new int[40];
		int b[] = new int[40];
		
		for (int i = 0; i < S.length(); i++) {
			int cs = S.charAt(i) - 'a' + 1;
			int ct = T.charAt(i) - 'a' + 1;
			
			if (a[cs] == 0) {
				a[cs] = ct;
			} else if (a[cs] != ct){
				System.out.println("No");
				return;
			}
			
			if (b[ct] == 0) {
				b[ct] = cs;
			} else if (b[ct] != cs){
				System.out.println("No");
				return;
			}
			
		}
		System.out.println("Yes");
	}
}
