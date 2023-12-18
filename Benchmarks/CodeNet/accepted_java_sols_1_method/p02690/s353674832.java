import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int N = 10001;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		long x = parseLong(sc.next());
		sc.close();
		long[] fi = new long[N];
		for (i = 1; i < N; i++) {
			fi[i] = (long)i*i*i*i*i;
		}
		int idx=0;
		for (i = 0; i < N; i++) {
			long tmp=fi[i]-x;
			int sig=1;
			if(tmp<0) {
				sig=-1;
				tmp=-tmp;
			}
			idx = Arrays.binarySearch(fi, tmp);
//			out.println(idx);
			if(idx>=0) {
				idx*=sig;
				break;
			}
		}
		int a=i;
		int b=idx;
//		while(true) {
//			if(fi[a]-fi[b]==x) {
//				break;
//			}
//			if(fi[a]+fi[b]==x) {
//				b=-b;
//				break;
//			}
//			if(fi[a]-fi[b]<x) {
//				a++;
//			} else {
//				b--;
//			}
//		}
//		long p=0;
//		if(x==1) {
//			p=1;
//		} else {
//			if(x%2==0) {
//				p=2;
//			} else {
//				for (i = 3; i*i <= x; i+=2) {
//					if(x%i==0) {
//						p=i;
//						break;
//					}
//				}
//				if(p==0) {
//					p=x;
//				}
//			}
//		}
//		long b = 0;
//		for (i = x/p; i >= 0; i--) {
//			b = i - p;
//			if(i*i*i*i*i-b*b*b*b*b==x) break;
//		}
		out.printf("%d %d%n", a, b);
	}
}
