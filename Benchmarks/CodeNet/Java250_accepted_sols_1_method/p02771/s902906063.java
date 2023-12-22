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
		HashSet<String> set = new HashSet<>();
		set.add(sc.next());
		set.add(sc.next());
		set.add(sc.next());
		sc.close();
		out.println(set.size()==2?"Yes":"No");
	}
}
