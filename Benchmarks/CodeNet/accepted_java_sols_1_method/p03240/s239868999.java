import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n = 0;
	static int[] x = null;
	static int[] y = null;
	static int[] h = null;
	
	public static void main(String[] args) {
		n = sc.nextInt();
		x = new int[n];
		y = new int[n];
		h = new int[n];
		int t = -1;
		for(int i = 0; i < n; ++i) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
			if(t < 0 && h[i] > 0) t = i;
		}
		
		int cx, cy, H;
		for(cx = 0; cx <= 100; ++cx) {
			for(cy = 0; cy <= 100; ++cy) {
				H = Math.abs(x[t] - cx) + Math.abs(y[t] - cy) + h[t];
				boolean isAppropriateH = true;
				for(int i = 0; i < n; ++i) {
					int height = H - Math.abs(x[i] - cx) - Math.abs(y[i] - cy);
					if(h[i] != Math.max(height, 0)) {
						isAppropriateH = false;
						break;
					}
				}
				
				if(isAppropriateH) {
					System.out.printf("%d %d %d\n", cx, cy, H);
					return;
				}
			}
		}
	}
}