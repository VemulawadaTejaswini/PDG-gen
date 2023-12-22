import java.util.*;
//import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
//		int i,j;
		Scanner sc = new Scanner(in);
		char[] a = sc.next().toCharArray();
		char[] b = sc.next().toCharArray();
		char[] c = sc.next().toCharArray();
		sc.close();
		out.println(a[a.length-1]==b[0]&&b[b.length-1]==c[0]?"YES":"NO");
	}
}
