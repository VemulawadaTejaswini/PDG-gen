import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int AB = 26;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int a = parseInt(sc.next());
		int b = parseInt(sc.next());
		int c = parseInt(sc.next());
		int d = parseInt(sc.next());
		sc.close();
		int dif = Math.min(b, d)-Math.max(a, c);
		dif = dif < 0?0:dif;
		out.println(dif);
	}
}
