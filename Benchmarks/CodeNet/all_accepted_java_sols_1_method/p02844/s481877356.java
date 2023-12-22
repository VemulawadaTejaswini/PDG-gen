import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static long MOD = 1000000007;
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		char[] s = sc.next().toCharArray();
		sc.close();
		int[] l = new int[10];
		Arrays.fill(l, n);
		int[] r = new int[10];
		Arrays.fill(r, -1);
		for (i = 0; i < n; i++) {
			l[(int)(s[n-1-i]-'0')]=n-1-i;
			r[(int)(s[i]-'0')]=i;
		}
		HashSet<String> set = new HashSet<>();
		char[] tmp = new char[3];
		for (i = 1; i < n-1; i++) {
			for (j = 0; j < 10; j++) {
				if(l[j]<i) {
					for (k = 0; k < 10; k++) {
						if(r[k]>i) {
							tmp[0] =  (char)('0'+j);
							tmp[1] =  s[i];
							tmp[2] =  (char)('0'+k);
//							out.println(Arrays.toString(tmp));
							set.add(String.valueOf(tmp));
						}
					}
				}
			}
		}
		out.println(set.size());
	}
}
