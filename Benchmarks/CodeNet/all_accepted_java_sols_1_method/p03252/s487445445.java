import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1= sc.next();
		String s2= sc.next();
		int a[] = new int[26];
		int b[] = new int[26];
		for (int i=0;i<s1.length();i++) {
			a[s1.charAt(i)-'a']++;
		}
		for (int i=0;i<s1.length();i++) {
			b[s2.charAt(i)-'a']++;
		}
		Arrays.sort(a);
		Arrays.sort(b);
		for (int i=0;i<26;i++) {
			if (a[i]!=b[i]) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

}