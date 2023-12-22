import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < s.length; i++) {
			set.add(s[i]);
		}
		
		String ans = set.size() == s.length ? "yes" : "no";
		System.out.println(ans);
		
		sc.close();
	}
}


