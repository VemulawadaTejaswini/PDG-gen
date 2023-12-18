import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final long MOD = 1000000007;
	public static final int TEN = 10;
	public static void main(String[] args) {
		int i=0,j=0;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int k = parseInt(sc.next());
		boolean[] f = new boolean[TEN];
		for (i = 0; i < k; i++) {
			f[parseInt(sc.next())]=true;
		}
		sc.close();
		int tmp=n;
		while(true) {
			tmp=n;
			while(tmp!=0) {
				if(f[tmp%10]) break; 
				tmp/=10;
			}
			if(tmp==0)break;
			n++;
		}
		out.println(n);
	}
}
