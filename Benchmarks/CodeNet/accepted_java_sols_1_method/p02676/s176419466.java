import java.util.*;
import java.math.*;
public class Main {
	static int x;
	static int ans;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = Integer.parseInt(in.next());
		String s = in.next();
		if(s.length() <= k) {
			System.out.println(s);
		}else {
			System.out.println(s.substring(0, k) + "...");
		}
	}
}