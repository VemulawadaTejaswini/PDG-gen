import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		int i,j, k;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		sc.close();
		int[] so = {3*5*7, 3*5*11, 3*5*13, 3*3*3*5, 3*3*3*7};
		int cnt=0;
		for (i = 0; i < so.length; i++) {
			if(so[i] <= n)cnt++;
		}
		out.println(cnt);
	}
}
