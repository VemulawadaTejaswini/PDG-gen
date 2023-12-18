import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a == 0 && b == 0) break;
			
			int c = b - a;
			
			int ax = 0;
			int bx = 0;
			int cx = 0;
			
			cx = c/1000;
			c -= cx*1000;
			bx = c/500;
			c -= bx*500;
			ax = c/100;
			
			System.out.println(ax + " " + bx + " " + cx);
			
			
			
			
		}
	}
}