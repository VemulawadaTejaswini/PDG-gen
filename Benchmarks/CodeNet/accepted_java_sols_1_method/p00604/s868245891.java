import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
      
      
public class Main {
	static int[] vx = new int[]{0,1,0,-1};
	static int[] vy = new int[]{1,0,-1,0};
	static int[] Y  = new int[]{0,0,0,1,1,1,2,2,2};
	static int[] X  = new int[]{0,1,2,0,1,2,0,1,2};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int[] p = new int[n];
			for(int i = 0; i < n; i++) {
				p[i] = sc.nextInt();
			}
			Arrays.sort(p);
			for(int i = 0; i < n-1; i++) {
				p[i+1] += p[i];
			}
			int sum = 0;
			for(int i = 0; i < n; i++) {
				sum += p[i];
			}
			System.out.println(sum);
		}
		
	}
 }