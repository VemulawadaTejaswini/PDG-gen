import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		String ans = "";
		for(int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		int a = partition(A, 0, n-1);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			if(i != a) {
				sb.append(A[i]);
			}else {
				sb.append("[");
				sb.append(A[i]);
				sb.append("]");
			}
			if(i != n-1) {
				sb.append(" ");
			}else {
				ans = sb.toString();
			}
		}
		System.out.println(ans);
		sc.close();
	}
	int partition(int[] A, int p, int r) {
		int x = A[r];
		int i = p - 1;
		for(int j = p; j < r; j++) {
			if(A[j] <= x) {
				i++;
				int tmp = A[i];
				A[i] = A[j];
				A[j] = tmp;				
			}
		}
		int tmp2 = A[i+1];
		A[i+1] = A[r];
		A[r] = tmp2;
		return i + 1;
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
