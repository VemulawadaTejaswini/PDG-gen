import java.util.*;
//import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

import java.io.PrintWriter;
import java.math.BigInteger;

public class Main {
	static long cnt=0;
	static BigInteger bi13 =new BigInteger("13");
	static BigInteger bi5 =new BigInteger("5");

	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		String s = sc.next();
		sc.close();
		int a[] = new int[s.length()];
		boolean prer = true;
		int rcnt = 1;
		int lcnt = 0;
		int p1=0;
		int p2=0;
		int aa;
		for (i = 1; i < s.length(); i++) {
			if(prer) {
				if(s.charAt(i) == 'R') {
					rcnt++;
				} else {
					prer=false;
					lcnt++;
					p1 = i-1;
					p2 = i;
				}
			} else {
				if(s.charAt(i) == 'R') {
					prer=true;
					aa = rcnt + lcnt;
					a[p1] = aa/2;
					a[p2] = aa/2;
					if(aa % 2 ==1) {
						if(rcnt % 2 ==1) {
							a[p1]++;
						} else {
							a[p2]++;
						}
					}
					rcnt=1;
					lcnt=0;
				} else {
					lcnt++;
				}
			}
		}
		aa = rcnt + lcnt;
		a[p1] = aa/2;
		a[p2] = aa/2;
		if(aa % 2 ==1) {
			if(rcnt % 2 ==1) {
				a[p1]++;
			} else {
				a[p2]++;
			}
		}
		PrintWriter out = new PrintWriter(System.out);
		for(i = 0; i < s.length(); i++) {
			out.print(a[i]);
			out.print(" ");
		}
		out.flush();
	}
}
