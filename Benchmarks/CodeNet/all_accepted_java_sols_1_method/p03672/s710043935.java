import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.parseLong;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int AB = 26;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		char[] s = sc.next().toCharArray();
		sc.close();
		int st = (s.length -1)/2;
		for (i = st; i > 0; i--) {
			boolean f = false;
			for (j = 0; j < i; j++) {
				if(s[j]!=s[j+i]) break;
			}
			if(j==i) break;
		}
		out.println(i*2);
	}
}
