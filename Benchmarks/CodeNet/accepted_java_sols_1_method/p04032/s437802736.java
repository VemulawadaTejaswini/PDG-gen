import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] chars = s.toCharArray();
		Set<Character> set = new HashSet<>();
		if(chars.length==2) {
			System.out.println(chars[0]==chars[1] ? "1 2" : "-1 -1");
			return;
		}
		for(int i = 2; i < chars.length; i++) {
			set.add(chars[i-2]);
			set.add(chars[i-1]);
			set.add(chars[i]);
			if(set.size() <= 2) {
				System.out.println((i-1)+" "+(i+1));
				return;
			}
			set.clear();
		}
		System.out.println("-1 -1");
	}
}