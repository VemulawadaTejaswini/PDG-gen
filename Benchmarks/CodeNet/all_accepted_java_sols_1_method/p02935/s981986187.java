import java.io.*;
import java.util.*;

class Main{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n == 1) {
		    System.out.println(sc.nextInt());
		}
		else {
		    int[] a = new int[n];
		    for(int i=0;i<n;i++) a[i] = sc.nextInt();
		    Arrays.sort(a);
		    double cur = (a[0]+a[1]) / 2.0;
		    for(int i=2;i<n;i++) {
		        cur = (cur + a[i]) / 2.0;
		    }
		    System.out.println(cur);
		}
	}
}