import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int d = sc.nextInt();
		int ans = 0;
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		long dsq = (long) d*d;
		for(int i = 0; i < n; i++) {
			int dx = Math.abs(x[i]);
			int dy = Math.abs(y[i]);
			long distance = (long)dx*dx + (long)dy*dy;
			if(distance <= dsq) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
