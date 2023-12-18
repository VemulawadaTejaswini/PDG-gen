import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int n = s.length();
		if(s.charAt(n - 1) == 's') {
			System.out.println(s + "es");
		}else {
			System.out.println(s + "s");
		}
	}
}