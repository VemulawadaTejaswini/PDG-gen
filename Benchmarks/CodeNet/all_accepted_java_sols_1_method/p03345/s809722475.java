import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(in);
		long a = parseLong(sc.next());
		long b = parseLong(sc.next());
		long c = parseLong(sc.next());
		long k = parseLong(sc.next());
		sc.close();
		out.println(k%2==0?a-b:b-a);
	}
}
