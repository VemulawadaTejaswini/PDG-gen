import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int M = 10;
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(in);
		long x = parseLong(sc.next());
		long y = parseLong(sc.next());
		sc.close();
		long a=x;
		int cnt=0;
		while(a<=y) {
			cnt++;
			a *= 2;
		}
		out.println(cnt);
	}
}
