import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		for (int i=0;i<s.length();i++) {
			int a = s.charAt(i)-'A';
			a=(a+N)%26;
			System.out.print((char)(a+'A'));
		}
	}
}