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
		String s = sc.next();
		sc.close();
		String s1 = s.substring(0, s.length()/2);
		String s2 = new StringBuffer(s.substring((s.length()+1)/2)).reverse().toString();
		String s1a = s1.substring(0, s1.length()/2);
		String s1b = new StringBuffer(s1.substring((s1.length()+1)/2)).reverse().toString();
		out.println(s1.equals(s2)&&s1a.equals(s1b)?"Yes":"No");
	}
}
