import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0063
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int res = 0;
		while(sc.hasNext()) {
			String s = sc.next();
			boolean ok = true;
			for (int i = 0; i < s.length() / 2; i++) 
				if (s.charAt(i) != s.charAt(s.length() - i - 1)) ok = false;
			
			if (ok) res++;
		}
		System.out.println(res);
	}
}