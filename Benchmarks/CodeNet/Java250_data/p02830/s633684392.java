import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.next());
		String s = in.next();
		String t = in.next();
		for(int i = 0; i < n; i++) {
			System.out.print(s.charAt(i) + "" + t.charAt(i));
		}
		System.out.print("\n");
	}
}