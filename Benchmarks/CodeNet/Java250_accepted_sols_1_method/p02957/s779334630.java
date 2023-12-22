import java.util.*;
//import static java.lang.Integer.*;
import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		long a = parseLong(sc.next());
		long b = parseLong(sc.next());
		sc.close();
		long k;
		k = a+b;
		if((k&1)==0)out.println(k/2);
		else out.println("IMPOSSIBLE");
	}
}
