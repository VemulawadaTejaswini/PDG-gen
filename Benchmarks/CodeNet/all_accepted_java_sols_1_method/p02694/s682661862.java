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
		long x = parseLong(sc.next());
		sc.close();
		long yen=100;
		int cnt=0;
		while(x>yen) {
			yen+=(long)floor((double)yen*.01);
			cnt++;
		}
		out.println(cnt);
	}
}
