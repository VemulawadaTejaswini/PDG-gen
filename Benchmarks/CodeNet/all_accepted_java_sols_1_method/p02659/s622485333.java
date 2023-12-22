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
		long a = parseLong(sc.next());
		char[] bs= sc.next().toCharArray();
		long b = 100*(bs[0]-'0')+10*(bs[2]-'0')+(bs[3]-'0');
//		double b = Double.parseDouble(sc.next());
		sc.close();
//		long ans=(long)((double)a*b);
		long ans=(a*b)/100;
		out.println(ans);
	}
}
