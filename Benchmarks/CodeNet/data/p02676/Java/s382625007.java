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
		int k = parseInt(sc.next());
//		char[] s = sc.next().toCharArray();
		String s = sc.next();
		sc.close();
		String ans=s;
		if(s.length()>k) {
			ans=s.substring(0,k) + "...";
		}
		out.println(ans);
	}
}
