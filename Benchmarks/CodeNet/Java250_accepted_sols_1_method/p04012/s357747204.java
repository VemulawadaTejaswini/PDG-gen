import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int a[] = new int[26];
		for (int i=0;i<s.length();i++ ) {
			a[s.charAt(i)-'a']++;
		}
		for (int i=0;i<a.length;i++ ) {
			if (a[i]%2==1) {
				System.out.println("No");
				return ;
			}
		}
		System.out.println("Yes");
		return ;
	}
}