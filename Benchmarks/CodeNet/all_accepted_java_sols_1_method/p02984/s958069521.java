import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		long[] a = new long[2*n];
		long sum = 0;
		long[] half = new long[2];
		for(i=0;i<n;i++) {
			a[n+i] = a[i] = parseLong(sc.next());
			sum += a[i];
			if(i!=0) {
				half[i%2]+=a[i];
			}
		}
		sc.close();
		PrintWriter pw = new PrintWriter(out);
		for(i=0;i<n;i++) {
			pw.print(sum-2*half[(i+1)%2]);
			pw.print(" ");
			half[(i+1)%2]+=(-a[i+1]+a[n+i]);
		}
		pw.flush();
	}
}
