import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int[] price;
	static int[] stock;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int[] r1 = new int[26];
		int[] r2 = new int[26];
		Arrays.fill(r1, -1);
		Arrays.fill(r2, -1);
		
		for (int i = 0; i < s.length(); i++) {
			char cs = s.charAt(i);
			char ct = t.charAt(i);
			int si = cs - 'a';
			int ti = ct - 'a';
			
			if (r1[si] < 0) {
				r1[si] = ct;
			} else if (r1[si] != ct) {
				System.out.println("No");
				return;
			}
			if (r2[ti] < 0) {
				r2[ti] = cs;
			} else if (r2[ti] != cs) {
				System.out.println("No");
				return;
			}
		}
		
		System.out.println("Yes");
		
	}
	
}
