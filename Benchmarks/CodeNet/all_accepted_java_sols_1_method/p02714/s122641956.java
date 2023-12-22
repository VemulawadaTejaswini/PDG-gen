import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.next());
		String s = in.next();
		int[][] left = new int[n][3];
		int[][] right = new int[n][3];
		for(int i = 0; i < n - 1; i++) {
			left[i + 1][0] = left[i][0];
			left[i + 1][1] = left[i][1];
			left[i + 1][2] = left[i][2];
			if(s.charAt(i) == 'R') {
				left[i + 1][0] += 1;
			}else if(s.charAt(i) == 'B') {
				left[i + 1][1] += 1;
			}else {
				left[i + 1][2] += 1;
			}
		}
		for(int i = n - 1; i > 0; i--) {
			right[i - 1][0] = right[i][0];
			right[i - 1][1] = right[i][1];
			right[i - 1][2] = right[i][2];
			if(s.charAt(i) == 'R') {
				right[i - 1][0] += 1;
			}else if(s.charAt(i) == 'B') {
				right[i - 1][1] += 1;
			}else {
				right[i - 1][2] += 1;
			}
		}
		long ans = 0L;
		for(int i = 0; i < n; i++) {
			if(s.charAt(i) == 'R') {
				ans += left[i][1] * right[i][2];
				ans += left[i][2] * right[i][1];
			}else if(s.charAt(i) == 'B') {
				ans += left[i][0] * right[i][2];
				ans += left[i][2] * right[i][0];
			}else {
				ans += left[i][0] * right[i][1];
				ans += left[i][1] * right[i][0];
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = i + 2; j < n; j += 2) {
				int mid = (j - i) / 2;
				if(s.charAt(i) != s.charAt(j)) {
					if(s.charAt(i + mid) != s.charAt(i)) {
						if(s.charAt(i + mid) != s.charAt(j)) {
							ans -= 1;
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
} 
