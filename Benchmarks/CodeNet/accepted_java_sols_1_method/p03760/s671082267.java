import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		for(int i = 0;i < s1.length() - 1;i++) {
		System.out.print(s1.charAt(i));
		System.out.print(s2.charAt(i));
		}
		System.out.print(s1.charAt(s1.length() - 1));
		if(s1.length() == s2.length()) {
			System.out.print(s2.charAt(s2.length() - 1));
		}
	}
}
