import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text=sc.next();
		char word[]=new char[26];
		for(int i=0;i<text.length();i++) {
			word[text.charAt(i) - 'a']++;
		}
		sc.close();
		for(int i=0;i<26;i++) {
			if((word[i] %2 )== 1) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}