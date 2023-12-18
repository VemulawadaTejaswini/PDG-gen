import java.util.*;
import static java.lang.System.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int n = sc.nextInt();
		if (n % 2 == 1) {
			String s = sc.next();
			out.println("No");
		}else {
			char[] s = sc.next().toCharArray();
			int half = s.length / 2;
			for(int i = 0; i < half; i++) {
				if (s[i] != s[i + half]) {
					flag = false;
					break;
				}
			}	
			if (flag)out.println("Yes");
			else out.println("No");
		}		
	}
}