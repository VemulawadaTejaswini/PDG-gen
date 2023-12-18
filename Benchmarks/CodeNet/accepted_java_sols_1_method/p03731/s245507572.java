import java.util.*;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(in);
		int N = parseInt(sc.next());
		int T = parseInt(sc.next());
		int[] t = new int[N];
		t[0] = parseInt(sc.next());
		int td=0;
		int x=0;
		for(i=1; i<N; i++) {
			t[i] = parseInt(sc.next());
			td = t[i]-t[i-1];
			x += td<T?td:T;
		}
		sc.close();
		x+=T;
		out.println(x);
	}
}
