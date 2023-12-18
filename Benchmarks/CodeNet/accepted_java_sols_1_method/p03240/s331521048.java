import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i, j, k;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[] x = new int[n];
		int[] y = new int[n];
		int[] h = new int[n];
		int ii = 0;
		for(i = 0; i < n; i++) {
			x[i] = parseInt(sc.next());  
			y[i] = parseInt(sc.next());  
			h[i] = parseInt(sc.next());  
			if(h[i]>0) ii = i;
		}
		sc.close();
		int hh0;
		int max=0;
		int mx = 0;
		int my = 0;
LABEL:	for (int cx = 0; cx <= 100; cx++) {
			for (int cy = 0; cy <= 100; cy++) {
				boolean f = true; 
				hh0 = abs(x[ii]-cx) + abs(y[ii]-cy) + h[ii];
				for (i=0; i < n; i++) {
					if(h[i]>0) {
						if(hh0 != abs(x[i]-cx) + abs(y[i]-cy) + h[i]) {
							f = false;
							break;
						}
					} else {
						if(hh0 - abs(x[i]-cx) - abs(y[i]-cy) > 0) {
							f = false;
							break;
						}
					}
				}
				if(f) {
					max = hh0;
					mx = cx;
					my = cy;
//					out.printf("%d %d %d%n", mx, my, max);
					break LABEL;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append(mx).append(" ").append(my).append(" ").append(max);
		out.println(sb.toString());
	}
}
