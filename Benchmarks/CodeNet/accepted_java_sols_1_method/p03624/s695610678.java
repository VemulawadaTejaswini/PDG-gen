
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		int[] a = new int[26];
		for(int i = 0 ; i < n ; i++) {
			char c = s.charAt(i);
			a[(int)(c - 'a')] = 1;
		}
		for(int i = 0 ; i < 26 ; i++) {
			if(a[i] == 0) {
				System.out.println((char)(i + 'a'));
				return;
			}
		}
		System.out.println("None");
	}
}