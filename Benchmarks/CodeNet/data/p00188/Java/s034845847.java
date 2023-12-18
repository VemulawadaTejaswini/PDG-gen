
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if(n == 0) break;
			int a[] = new int[n];
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			int s = sc.nextInt();
			System.out.println(binarySearch(a, s));
		}
	}
	int binarySearch(int[] a, int x) {
		int cnt = 0;
		int left = 0;
		int right = a.length-1;
		int center = (left + right) / 2;
		for(;left <= right;) {
			cnt++;
			if(a[center] == x) break;
			else if(a[center] > x) right = center-1;
			else left = center + 1;
			center = (left + right) / 2;
		}
		
		return cnt;
	}

	public static void main(String[] args) {
		new Main().run();
	}
}