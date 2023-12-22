import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Set<String> set = new HashSet<String>();
		
		char wordEnd = '0';
		for(int i = 0;  i < N; i++) {
			String s = sc.next();
			if(i != 0) {
				if(wordEnd != s.charAt(0)|| set.contains(s)) {
					System.out.println("No");
					return;
				}
			}
			wordEnd = s.charAt(s.length()-1);
			set.add(s);
		}
		System.out.println("Yes");
	}

}
