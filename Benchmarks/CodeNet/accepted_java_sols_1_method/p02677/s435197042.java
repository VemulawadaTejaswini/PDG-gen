import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		double a = parseDouble(sc.next());
		double b = parseDouble(sc.next());
		double h = parseDouble(sc.next());
		double m = parseDouble(sc.next());
		sc.close();
		double dx = cos(PI*(h/6+m/360)) * a - cos(PI*m/30) * b;
		double dy = sin(PI*(h/6+m/360)) * a - sin(PI*m/30) * b;
		double ans=sqrt(dx*dx+dy*dy);
		out.println(ans);
	}
}
