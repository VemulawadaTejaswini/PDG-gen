import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
    
    
public class Main {
	static int INF = 2 << 27;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int S = sc.nextInt();
			if(n == 0 && S == 0) break;
			int[] r = new int[n];
			for(int i = 0; i < n; i++) {
				r[i] = sc.nextInt();
			}
			int ans = 0;
			for(int i = 0; i < n; i++) {
				for(int j = i+1; j < n; j++) {
					if(r[i] + r[j] > S) ans++;
				}
			}
			System.out.println(ans);
 		}
	}
}