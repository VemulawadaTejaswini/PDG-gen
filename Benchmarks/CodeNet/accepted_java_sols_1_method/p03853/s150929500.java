import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;
//import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int w = parseInt(sc.next());
		String[] s = new String[n];
		for (i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();
		for (i = 0; i < n; i++) {
			out.println(s[i]);
			out.println(s[i]);
		}
	}
}
