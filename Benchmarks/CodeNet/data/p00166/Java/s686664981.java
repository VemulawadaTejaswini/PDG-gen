import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int m = sc.nextInt();
			if(m == 0) break;
			double a = 0;
			int r = 360;
			for(int i = 0; i < m-1; i++) {
				int x = sc.nextInt();
				a += Math.sin(Math.PI * x / 180);
				r -= x;
			}
			a += Math.sin(Math.PI * r / 180);
			
			int n = sc.nextInt();
			double b = 0;
			
			r = 360;
			for(int i = 0; i < n-1; i++) {
				int x = sc.nextInt();
				b+= Math.sin(Math.PI * x / 180);
				r -= x;
			}
			b += Math.sin(Math.PI * r / 180);
			
			
			if(Math.abs(a - b) < 1.0e-7) {
				System.out.println(0);
			}
			else if(a < b) {
				System.out.println(2);
			}
			else {
				System.out.println(1);
			}
			
			
		}
	}
	

}