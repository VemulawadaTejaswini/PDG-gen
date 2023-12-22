import java.util.*;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		boolean flag = false;
		char c = ' ';
		for(c = 'a'; c <= 'z'; c++) {
			if (s.indexOf(c) == -1) {
				flag = true;
				break;
			}
		}
		if (flag) System.out.println(c);
		else System.out.println("None");
		
	}
}