//package abc128.B;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] sp = new String[n];
		
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			int p = sc.nextInt();
			sp[i] = s + '_' + (1100 - p) + '_' + (i + 1);
		}
		
		Arrays.sort(sp);
		
		for (int i = 0; i < n; i++) {
			String ans = sp[i].split("_")[2];
			System.out.println(ans);
		}
		
	}

}
