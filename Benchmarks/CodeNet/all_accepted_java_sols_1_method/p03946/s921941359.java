import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int t = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) a[i] = Integer.parseInt(sc.next());
			int[] b = new int[n]; Arrays.fill(b, 0);
			int[] c = new int[n]; Arrays.fill(c, 0);
			PriorityQueue<Integer> alr = new PriorityQueue<Integer>();
			int count = 0; int max = 0; int dis = 0; int ans = 0;
			for (int i = n-1; i >= 0; i--) {
				if(max < a[i]) {
					count = 1;
					max = a[i];
				}else if(max == a[i]){
					count++;
				}else {
					b[i] = max;
					c[i] = count;
					dis = Math.max(max-a[i], dis);
				}
			}
			for (int i = 0; i < n; i++) {
				if(alr.isEmpty()) {
					if(b[i]-a[i] == dis) {
						alr.add(b[i]);
						ans += c[i];
					}
				}else {
					if((b[i]-a[i]==dis)&&!(alr.peek() == b[i])) {
						alr.add(b[i]);
						ans += c[i];
					}
				}
			}
			System.out.println(ans);
			sc.close();
		}catch (OutOfMemoryError e) {
			System.out.println(-1);
		}

	}
}