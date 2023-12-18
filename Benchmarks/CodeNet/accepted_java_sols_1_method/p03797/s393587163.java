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
		long n = parseLong(sc.next());
		long m = parseLong(sc.next());
		sc.close();
		long a=0;
		if(n>=m/2) {
			a=m/2;
		} else {
			a=n+(m-(n*2))/4;
		}
		out.println(a);
	}
}
