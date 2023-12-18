import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i=0,j=0,k=0;
		Scanner sc = new Scanner(in);
		int h = parseInt(sc.next());
		int w = parseInt(sc.next());
		int n = parseInt(sc.next());
		int[] a = new int[n];
		for(i=0;i<n;i++) {
			a[i] = parseInt(sc.next());
		}
		sc.close();
		int[][] c = new int[h][w];
		int p=0;
		for (i = 0; i < n; i++) {
			for (k = p; k < p+a[i]; k++) {
				c[k/w][(k/w)%2==0?k%w:w-k%w-1] = i+1;
			};
			p+=a[i];
		}
		PrintWriter pw = new PrintWriter(out);
		for (i = 0; i < h; i++) {
			for (j = 0; j < w; j++) {
				pw.print(c[i][j]);
				pw.print(" ");
			}
			pw.println();
		}
		pw.flush();
	}
}
