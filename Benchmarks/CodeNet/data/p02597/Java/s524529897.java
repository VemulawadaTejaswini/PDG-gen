import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		char[] a = sc.next().toCharArray();
		
		int r = 0;
		int w = 0;
		for(int i = 0; i < n; i++) {
			if(a[i] == 'R') {
				r++;
			} else {
				w++;
			}
		}
		int done_r = 0;
		int done_w = 0;
		int ans = n;
		for(int i = 0; i < n; i++) {
			if(a[i] == 'R') {
				done_r++;
			} else {
				done_w++;
			}
			int ops = 0;
			int swaps = Math.max(Math.min(done_w, r-done_r), 0);
			ops += swaps;
			int changedW = done_w - swaps;
			int leftR = (r-done_r)-swaps;
			ops += leftR;
			ops += changedW;
			ans = Math.min(ans, ops);
//			System.out.println(i + " " + ops);
		}
		System.out.println(ans);
	}
}
