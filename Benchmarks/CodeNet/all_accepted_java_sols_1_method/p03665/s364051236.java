import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int MAX = 50;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int p = parseInt(sc.next());
		int[] a = new int[n];
		int odd=0;
		int even=0;
		for (i = 0; i < a.length; i++) {
			a[i] = parseInt(sc.next());
			if(a[i]%2==0) {
				even++;
			} else {
				odd++;
			}
		}
		sc.close();
		long[][] comb = new long[MAX+1][MAX+1];
		comb[0][0] = 1;
		for (i = 1; i <= MAX; i++) {
			for (j = 0; j <= i; j++) {
				comb[i][j] = (j>0?comb[i-1][j-1]:0) + comb[i-1][j]; 
			}
		}
		long evencnt=0;
		for (i = 0; i <= even; i++) {
			evencnt+=comb[even][i];
		}
//		out.println(evencnt);
		long oddcnt=0;
		for (i = p; i <= odd; i+=2) {
			oddcnt+=comb[odd][i];
		}
//		out.println(oddcnt);
		out.println(oddcnt*evencnt);
	}
}
