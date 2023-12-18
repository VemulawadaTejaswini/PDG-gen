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
		for(int i = 0; i <= n; i++) {
			ans = Math.min(ans, Math.max(done_w, r));
			if(i < n) {
				if(a[i] == 'W') {
					w--;
					done_w++;
				} else {
					r--;
					done_r++;
				}
			}
		}
		System.out.println(ans);
	}
}
