import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int w = parseInt(sc.next());
		int h = parseInt(sc.next());
		int n = parseInt(sc.next());
		int[] x = new int[n]; 
		int[] y = new int[n]; 
		int[] a = new int[n];
		int xl=0;
		int xr=w;
		int yb=0;
		int yt=h;
		for (i = 0; i < n; i++) {
			x[i] = parseInt(sc.next());
			y[i] = parseInt(sc.next());
			a[i] = parseInt(sc.next());
			switch(a[i]) {
			case 1:
				if(xl < x[i]) {
					xl = x[i];
				}
				break;
			case 2:
				if(xr > x[i]) {
					xr = x[i];
				}
				break;
			case 3:
				if(yb < y[i]) {
					yb = y[i];
				}
				break;
			case 4:
				if(yt > y[i]) {
					yt = y[i];
				}
				break;
			}
		}
		sc.close();
		int xx =xr - xl;  
		int yy =yt - yb;
		if(xx<0)xx=0;
		if(yy<0)yy=0;
		out.println(xx*yy);
	}
}
