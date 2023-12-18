import java.util.*;
import java.io.*;
import java.math.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		for(int sss = 0; sss < m; sss++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			int max = 0;
			for(int ss = 0; ss < n; ss++) {
				int type = sc.nextInt();
				double c = sc.nextDouble();
				int d = sc.nextInt();
				if(type == 0) {
					//tanri
					int A = a;
					int B = 0;
					for(int i = 0; i < b; i++) {
						B += A * c;
						A -= d;
					}
					max = Math.max(A + B,max);
				}
				else {
					int A = a;
					for(int i = 0; i < b; i++) {
						A += A*c;
						A -= d;
					}
					max = Math.max(A, max);
				}
			}
			System.out.println(max);
		}
	}
}