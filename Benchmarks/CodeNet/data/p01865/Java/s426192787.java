import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int N = sc.nextInt();
		int[] x = new int[N];
		int[] w = new int[N];
		for(int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			w[i] = sc.nextInt();
		}
		int l = 0;
		int r = 0;
		
		for(int i = 0; i < N; i++) {
			if(x[i] == 0) continue;
			if(x[i] < 0) {
				l += -x[i] * w[i];
			}
			else {
				r += x[i] * w[i];
			}
		}
		int aN = 0;
		ArrayList<Integer> xn = new ArrayList<Integer>();
		ArrayList<Integer> wn = new ArrayList<Integer>();
		if(l == r) {
			aN = 0;
		}
		else if(l < r) {
			while(r - l > 50000) {
				aN++;
				xn.add(-1);
				wn.add(50000);
				l += 50000;
			}
			aN++;
			xn.add(-1);
			wn.add(r - l);
		}
		else {
			while(l - r > 50000) {
				aN++;
				xn.add(1);
				wn.add(50000);
				r += 50000;
			}
			aN++;
			xn.add(1);
			wn.add(l - r);
		}
		System.out.println(aN);
		for(int i = 0; i < aN; i++) {
			System.out.println(xn.get(i) + " " + wn.get(i));
		}
		
	}
}
	
	
		