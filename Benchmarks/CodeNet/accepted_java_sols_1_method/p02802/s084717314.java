import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int MOD = 1000000007;
	public static ArrayList<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int m = parseInt(sc.next());
		int[] p = new int[m];
		String[] s = new String[m];
		for(i=0;i<m;i++) {
			p[i] = parseInt(sc.next());
			s[i] = sc.next();
		}
		sc.close();
		boolean[] acf = new boolean[n+1];
		int[] wac = new int[n+1];
		int ac = 0;
		int wa = 0;
		for(i=0;i<m;i++) {
			if(s[i].equals("WA")) {
				if(!acf[p[i]]) {
					wac[p[i]]++;
				}
			} else {
				if(!acf[p[i]]) {
					ac++;
					wa+=wac[p[i]];
					acf[p[i]]=true;
				}
			}
		}
		out.printf("%d %d%n", ac, wa);
	}
}
