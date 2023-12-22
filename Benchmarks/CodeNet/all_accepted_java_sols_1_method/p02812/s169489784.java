import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		char[] s = sc.next().toCharArray();
//		String s = sc.next();
		sc.close();
		int cnt=0;
		for (i = 0; i < s.length-2; i++) {
			if(s[i]=='A'
			&& s[i+1]=='B'
			&& s[i+2]=='C') {
				cnt++;
			}
		}
		out.println(cnt);
	}
}
