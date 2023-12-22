import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.parseLong;
//import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(System.in);
		int n = parseInt(sc.next());
		int m = parseInt(sc.next());
		int X = parseInt(sc.next());
		int Y = parseInt(sc.next());
		int[] x = new int[n];
		for(i=0;i<n;i++) {
			x[i] = parseInt(sc.next());
		}
		int[] y = new int[m];
		for(i=0;i<m;i++) {
			y[i] = parseInt(sc.next());
		}
		sc.close();
		Arrays.sort(x);
		Arrays.sort(y);
		boolean f = false;
		if(x[n-1]<y[0] && X<y[0] && x[n-1]<Y) f = true;
		out.println(f?"No War":"War");
	}
}
