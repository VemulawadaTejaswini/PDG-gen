
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\\n");
		for(;;) {
			String str = sc.next();
//			System.out.println(str);
			if(str.charAt(0) == '.' && str.length() == 2) break;
			LinkedList<Character> stack = new LinkedList<Character>();
			boolean flg = true;
			for(int i=0;i<str.length();i++) {
				if( str.charAt(i) == '(' || str.charAt(i) == '[' ) 
					stack.addLast(str.charAt(i));
				else if (str.charAt(i) == ')') {
					if( !stack.isEmpty() && stack.removeLast() == '(' );
					else {
						flg = false;
						break;
					}
				}
				else if (str.charAt(i) == ']') {
					if( !stack.isEmpty() && stack.removeLast() == '[' );
					else {
						flg = false;
						break;
					}
				}
			}
			if(flg) {
				if( stack.isEmpty() ) System.out.println("yes");
				else System.out.println("no");
			}
			else {
				System.out.println("no");
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}