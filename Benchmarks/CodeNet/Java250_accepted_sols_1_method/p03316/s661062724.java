import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;
//import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		String s = sc.next();
		sc.close();
		char[] ni = s.toCharArray();
		int n = parseInt(s);
		int sn = 0;
		for (i = 0; i < ni.length; i++) {
			sn += ni[i]-'0';
		}
		out.println(n%sn==0?"Yes":"No");
	}
}
