import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int add = 0;
		for(int i = 0; i < s.length(); i++) {
			int cur = Integer.parseInt(s.substring(i, i + 1));
			add += cur;
		}
		if(add % 9 == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}