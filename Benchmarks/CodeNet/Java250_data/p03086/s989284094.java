import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Character> set = new HashSet<Character>();
		set.add('A');
		set.add('C');
		set.add('G');
		set.add('T');
		
		int max = 0;
		String str = sc.next();
		
		for (int i = 0; i < str.length(); i++) {
			nextStr:
			for (int j = i; j < str.length(); j++) {
				for (int k = i; k <= j; k++) {
					if (!set.contains(str.charAt(k)))
						continue nextStr;
				}
				max = Math.max(j - i + 1, max);
			}
		}
		System.out.println(max);
	}

}
