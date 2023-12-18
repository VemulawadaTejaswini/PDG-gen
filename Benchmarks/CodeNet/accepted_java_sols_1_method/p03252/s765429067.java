import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String t = sc.next();
		String s = sc.next();
		char[] c = new char[1000];
		Arrays.fill(c, '0');
		int count = 0;
		String s2 = "";
		for(int i = 0 ; i < s.length() ; i++) {
			if(c[s.charAt(i)] == '0') {
				count++;
				c[s.charAt(i)] = t.charAt(i);
				if(!s2.contains(t.charAt(i) + "")) {
				s2 += t.charAt(i);
				}
				else {
					System.out.println("No");
					return;
				}
			}
			else if(c[s.charAt(i)] != t.charAt(i)){
				System.out.println("No");
				return;
			}
		}

		sc.close();
		System.out.println("Yes");

	}
}

