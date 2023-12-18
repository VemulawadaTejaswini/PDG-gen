import java.util.Scanner;

public class Main{
	static int n;
	static int[]a;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		a = new int[n  +1];
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		System.out.println(lis());
	}
	static int lis() {
		int len = 1;
		int[]L = new int[n];
		L[0] = a[0];
		for(int i = 1; i < n; i++) {
			if(L[len - 1] < a[i]) {
				L[len++] = a[i];
			}else {
//				int k  = Arrays.binarySearch(a, 0, len - 1, a[i]);
//				if(k < 0) {
//					k = ~k;
//				}
				int idx = bs(L, 0, len - 1, a[i]);
				L[idx] = a[i];
			}
		}
		return len;
	}
	static int bs(int[]L, int from, int to, int key) {
		int l = from - 1;
		int r = to;
		while(r - l > 1) {
			int mid = (l + r) / 2;
			if(L[mid] >= key) {
				r = mid;
			}else {
				l = mid;
			}
		}
		return r;
	}
}
