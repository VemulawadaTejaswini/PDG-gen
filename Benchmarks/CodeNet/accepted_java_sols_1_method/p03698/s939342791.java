import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		
		Set<Character> set = new HashSet<Character>();
		boolean flag = true;
		for(int i = 0;i < S.length();++i) {
			if(set.contains(S.charAt(i))) {
				flag = false;
				break;
			} else {
				set.add(S.charAt(i));
			}
		}
		if(flag)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
