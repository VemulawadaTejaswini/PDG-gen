import java.util.*;
import java.math.BigInteger;
import static java.lang.System.*;
import java.util.*;
import java.math.BigInteger;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] C = new char[s.length()];
		for(int i=0; i<s.length(); i++)
			C[i] = s.charAt(i);
		boolean flag = true;
		
		for(int i=0; ; i++) {
			//out.print("i =" + i);
			int right = (s.length()-1) / 2 - 1 - i;
			//out.println("right=" + right);
			if (i >= right) break;
			if ( C[i] != C[right]) {
				//out.println("FALSE");
				flag = false; break;
			}
		}
			int left = (s.length()+3)/2 - 1;
		
			if (flag) {
		for(int i = left; ; i++) {		
			int minus = i - left;
			int right = s.length() - 1 - minus;
			//out.print("i =" + i);
			//out.println("right=" + right);
			if (i >= right) break;
			if (C[i] != C[right]) {
				flag = false; break;
			}
		}
			}
		for(int i=0; i<(s.length()-1) /2; i++) {
			int right = left + i;
			if ( C[i] != C[right]) {
				flag = false; break;
			}
		}
			
		if (flag) out.print("Yes");
		else out.print("No");
		
	}
}