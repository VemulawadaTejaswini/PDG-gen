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
		int[] a = new int[n];
		for(i=0;i<n;i++) {
			a[i] = parseInt(sc.next());
		}
		sc.close();
		i = 1;
		j = 0;
		int cnt=0;
//		boolean f=false;
LABEL:	while(true) {
			while(i!=a[j]) {
				j++;
				cnt++;
				if(j==n) {
					break LABEL;
				}
			}
			j++;
			if(j==n) {
				break LABEL;
			}
			i++;
		}
		out.println(n==cnt?-1:cnt);
	}
}
