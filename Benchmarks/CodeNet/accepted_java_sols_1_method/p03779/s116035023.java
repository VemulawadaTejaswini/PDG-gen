import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int AB = 26;
	public static void main(String[] args) {
		long i=0,j=0,k=0;
		Scanner sc = new Scanner(in);
		long x = parseLong(sc.next());
		sc.close();
		long tmp = 0;
		for (i = 1; i <= x; i++) {
			tmp+=i;
			if(tmp>=x) {
				break;
			}
		}
		out.println(i);
	}
}
