//package reedeka;
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, t, a;
		n = sc.nextInt();
		t = sc.nextInt();
		a = sc.nextInt();
		int i;
		double tmp, temp, s;
		int index = 1;
		int h;
		h = sc.nextInt();
		temp = t - 0.006*h;
		tmp = Math.abs(a - temp);
		for(i=2; i<=n; i++) {
			h = sc.nextInt();
			temp = t - 0.006*h;
			s = Math.abs(a-temp);
			if(s<tmp) {
				tmp = s;
				index = i;
			}
		}
		System.out.println(index);
	}
}
