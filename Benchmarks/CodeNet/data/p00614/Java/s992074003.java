import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
      
      
public class Main {
	static int[] count = new int[] {1,5,10,50,100,500};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int p = sc.nextInt();
			if(p == 0) break;
			int[] count = new int[6];
			for(int i = 0; i < 6; i++) {
				count[i] = sc.nextInt();
			}
			int min = dfs(count,p,0,count.length-1);
			System.out.println(min);
		}
	}
	static int dfs(int[] count, int p, int c, int d) {
		if(p <= 0) {
			return c + o(-p);
		}
		if(d < 0) return Integer.MAX_VALUE;
		
		int tmp = p / Main.count[d];
		if(tmp > count[d]) {
			tmp = count[d];
			return dfs(count,p - tmp*Main.count[d],c + tmp, d-1);
		}
		int A = dfs(count,p - tmp*Main.count[d],c + tmp, d-1);
		int B = Integer.MAX_VALUE;
		if(tmp + 1 <= count[d]) {
			B = dfs(count,p - (tmp+1)*Main.count[d], c + (tmp+1),d-1);
		}
		return Math.min(A, B);
		
		
		
		
		
	}
	static int o(int p) {
		int sum = 0;
		for(int i = count.length-1; i >= 0; i--) {
			if(p / count[i] > 0) {
				int tmp = p/count[i];
				p -= tmp * count[i];
				sum += tmp;
			}
		}
		return sum;
	}
 }