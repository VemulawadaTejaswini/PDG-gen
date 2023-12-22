//package reedeka;
import java.util.*;
import java.math.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		//System.close();
		long t1 = 2, t2 = 1;
		int i;
		long s = t2;
		if(n==0) {
			s = t1;
		}
		else {
		for(i=2; i<=n; i++) {
			s = t1 + t2;
			t1 = t2;
			t2 = s;
		}
		}
		System.out.println(s);
	}
}
