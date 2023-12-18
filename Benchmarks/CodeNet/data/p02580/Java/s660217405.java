import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int w = in.nextInt();
		int m = in.nextInt();
		
		HashSet<Long> bombs = new HashSet<Long>();
		int[] rs = new int[h + 1];
		int[] cs = new int[w + 1];
		for (int i = 0; i < m; i++) {
			int r = in.nextInt();
			rs[r]++;
			int c = in.nextInt();
			cs[c]++;
			bombs.add(hash(r,c));
		}
		
		int maxR = 0, maxC = 0;
		for (int r = 0; r <= h; r++) {
			maxR = Math.max(maxR, rs[r]);
		}
		for (int c = 0; c <= w; c++) {
			maxC = Math.max(maxC, cs[c]);
		}

		ArrayList<Integer> candidatesR = new ArrayList<Integer>();
		ArrayList<Integer> candidatesC = new ArrayList<Integer>();
		for (int r = 1; r <= h; r++) {
			if (rs[r] == maxR) {
				candidatesR.add(r);
			}
		}
		for (int c = 1; c <= w; c++) {
			if (cs[c] == maxC) {
				candidatesC.add(c);
			}
		}
		
		int max = maxR + maxC - 1;
		outer : for (int r : candidatesR) {
			for (int c : candidatesC) {
				if (!bombs.contains(hash(r,c))) {
					max++;
					break outer;
				}
			}
		}
		
		System.out.println(max);
		
		in.close();
	}
	
	static long hash(int r, int c) {
		return r * (long)10e6 + c;
	}
}
