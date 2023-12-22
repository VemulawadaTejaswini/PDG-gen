import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		char[] w = sc.next().toCharArray();
		sc.close();
		int[] c = new int[26];
		for (i = 0; i < w.length; i++) {
			c[w[i]-'a']++;
		}
		boolean f = true;
		for (i = 0; i < c.length; i++) {
			if(c[i]%2==1) {
				f=false;
				break;
			}
		}
		out.println(f?"Yes":"No");
	}
}
