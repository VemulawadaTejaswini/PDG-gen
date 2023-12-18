import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.parseLong;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
//import static java.lang.System.*;

import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int n = parseInt(sc.next());
		int[] a = new int[n];
		int max1=0;
		int max2=0;
		int i1 = -1;
		int i2 = -1;
		for(i=0;i<n;i++) {
			a[i] = parseInt(sc.next());
			if(max1<a[i]) {
				max1=a[i];
				i1=i;
				continue;
			}
			if(max2<a[i]) {
				max2=a[i];
				i2=i;
			}
		}
		sc.close();
		PrintWriter out = new PrintWriter(System.out);
		for(i = 0; i < n; i++) {
			if(i==i1) {
				out.println(max2);
			} else {
				out.println(max1);
			}
		}
		out.flush();
	}
}
