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
		long a = parseLong(sc.next());
		long b = parseLong(sc.next());
		long k = parseLong(sc.next());
		sc.close();
		long a2 = Math.max(0, a-k);
		k-=a-a2;
		long b2 = Math.max(0, b-k);
		out.printf("%d %d%n", a2, b2);
	}
}
