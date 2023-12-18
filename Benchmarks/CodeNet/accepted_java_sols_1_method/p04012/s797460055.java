import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ary = sc.next().toCharArray();
		Set set = new HashSet<>();
		for (char c : ary) {
			set.add(c);
		}

		boolean beau = true;
		for (Object o : set) {
			int count = 0;
			for (char c : ary) {
				if(c == (char)o) {
					count++;
				}
			}
			if(count%2 != 0) {
				beau = false;
			}
		}
		if(beau) System.out.println("Yes");
		else System.out.println("No");
	}
}