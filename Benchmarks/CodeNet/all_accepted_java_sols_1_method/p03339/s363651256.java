import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		char[] s = sc.next().toCharArray();
		sc.close();
		int[] w = new int[n];
		int[] e = new int[n];
		for (i = 1; i < n; i++) {
			w[i] = w[i-1] + (s[i-1]=='W'?1:0);
			e[n-1-i] = e[n-i] + (s[n-i]=='E'?1:0);
		}
//		out.println(Arrays.toString(w));
//		out.println(Arrays.toString(e));
		int mn = n;
		int tmp = 0;
		for (i = 0; i < n; i++) {
			tmp = w[i] + e[i];
			if(tmp < mn) mn = tmp;
		}
		out.println(mn);
	}
}