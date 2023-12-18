import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		Set<Character> right = new HashSet<Character>();
		right.add('y'); right.add('u'); right.add('i'); right.add('o'); right.add('p'); right.add('h'); right.add('j'); right.add('k'); right.add('l'); right.add('n'); right.add('m');
		String s;
		while (true) {
			s = sc.nextLine();
			if (s.equals("#")) break;
			char[] letters = s.toCharArray();
			boolean flag = right.contains(letters[0]);
			boolean fb;
			int count = 0;
			for (int i = 1; i < letters.length; i++) {
				fb = right.contains(letters[i]);
				if (flag != fb)
					count++;
				flag = fb;
			}
			out.println(count);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}