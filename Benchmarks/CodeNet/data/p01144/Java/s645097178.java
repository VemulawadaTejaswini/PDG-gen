import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	class A {
		int d, p;
		A(int d, int p) {
			this.d = d;
			this.p = p;
		}
	}
	
	void sort(A[] a) {
		int n = a.length;
		for (int i = n-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (a[j].p < a[j+1].p) {
					A temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	
	void run() {
		int n, m;
		while (true) {
			n = sc.nextInt(); m = sc.nextInt();
			if (n == 0) break;
			A[] a = new A[n];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				int d = sc.nextInt(), p = sc.nextInt();
				a[i] = new A(d, p);
				sum += d*p;
			}
			
			sort(a);
			int guard = 0;
			int index = 0;
			while (m >= a[index].d) {
				m -= a[index].d;
				guard += a[index].d*a[index].p;
				index++;
			}
			guard += m*a[index].p;
			out.println(sum-guard);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}