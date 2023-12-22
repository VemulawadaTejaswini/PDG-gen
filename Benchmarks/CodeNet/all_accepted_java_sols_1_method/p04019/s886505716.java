import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
	final static PrintStream so = System.out;
	final static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		char[] chars = sc.next().toCharArray();
		Map<Character, Integer> counter = new HashMap<>();
		counter.put('E', 0);
		counter.put('W', 0);
		counter.put('N', 0);
		counter.put('S', 0);
		
		for (char ch: chars) {
			counter.put(ch, counter.get(ch) + 1);
		}
		
		int e = counter.get('E');
		int w = counter.get('W');
		int n = counter.get('N');
		int s = counter.get('S');
		boolean ew = (e == 0 && w > 0) || (w == 0 && e > 0);
		boolean ns = (n == 0 && s > 0) || (s == 0 && n > 0);
		so.println(ew || ns ? "No" : "Yes");
	}
}
