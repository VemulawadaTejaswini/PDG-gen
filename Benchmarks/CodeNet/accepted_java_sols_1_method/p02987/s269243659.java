import java.util.*;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c =sc.next().toCharArray();
		boolean flag = false;
		if ( c[0] == c[1] && c[2] == c[3] && c[0] != c[2])
			flag = true;
		if (c[0] == c[2] && c[1] == c[3] && c[0 ] != c[1])
			flag = true;
		if (c[0] == c[3] && c[1] == c[2] && c[0] != c[1])
			flag = true;
		if(flag)
			out.println("Yes");
		else
			out.println("No");
		
	}
}