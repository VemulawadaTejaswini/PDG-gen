import java.util.*;
import static java.lang.System.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		StringBuilder sb = new StringBuilder();
		for(char c: s) {
			c += n;
			if (c > 'Z') {
				c -=26;
			} 	
			sb.append(c);
		}
		out.println(sb);
	}
}