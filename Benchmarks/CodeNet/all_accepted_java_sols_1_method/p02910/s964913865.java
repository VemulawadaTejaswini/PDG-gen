import java.util.*;
import static java.lang.System.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		String ans = "Yes";
		
		for(int i =0; i < c.length; i++) {
			if(i % 2 == 0) {//奇数
				if(c[i] == 'L') {
					ans = "No";
					break;
				}				
			} else {
				if (c[i] == 'R') {
					ans = "No";
					break;
				}
			}
		}
		out.println(ans);
		
	}
}