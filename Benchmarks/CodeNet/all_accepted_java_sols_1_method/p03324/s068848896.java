//package reedeka;
import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int d, n;
		d = sc.nextInt();
		n = sc.nextInt();
		int i;
		int s = 1;
		for(i=0; i<d; i++) s *= 100;
		if(n<=99) {
			System.out.println(s*n);
		}
		else {
			System.out.println(s*101);
		}
	}
}
