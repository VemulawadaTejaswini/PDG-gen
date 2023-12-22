import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		Integer a[] = new Integer[3];
		a[0] = parseInt(sc.next());
		a[1] = parseInt(sc.next());
		a[2] = parseInt(sc.next());
		sc.close();
		Arrays.sort(a, Collections.reverseOrder());
		int ans = a[0]*10+a[1]+a[2];
		out.println(ans);
	}
}
