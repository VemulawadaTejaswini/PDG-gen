import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static final char a = 'A';
	public static final char c = 'C';
	public static final char g = 'G';
	public static final char t = 'T';
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		char b = scanner.next().charAt(0);
		Map<Character,Character> map = new TreeMap<Character,Character>();
		map.put(a, t);
		map.put(t, a);
		map.put(g, c);
		map.put(c, g);
		System.out.print(map.get(b));
		scanner.close();
	}
}