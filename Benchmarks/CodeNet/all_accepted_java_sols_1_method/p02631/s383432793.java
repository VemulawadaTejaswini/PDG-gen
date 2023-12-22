import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[] a = new int[n];
		int xorsum = 0;
		for (i = 0; i < n; i++) {
			a[i] = parseInt(sc.next());
			xorsum ^= a[i];
		}
		sc.close();
		PrintWriter pw = new PrintWriter(System.out);
		for(i = 0; i < n; i++) {
			pw.print(xorsum^a[i]);
			if(i==n-1) {
				pw.println();
			} else {
				pw.print(" ");
			}
		}
		pw.flush();
	}
}
