
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = true;
		Set<String> set = new HashSet<>();
		String s = sc.next();
		char tail = s.charAt(s.length() - 1);
		set.add(s);
		for(int i = 1; i < n; i++) {
			s = sc.next();
			if(tail != s.charAt(0) || set.contains(s)) {
				flag = false;
				break;
			} else {
				tail = s.charAt(s.length() - 1);
				set.add(s);
			}
		}
		if(flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
