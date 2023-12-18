import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		for(int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i = 1; i <= n; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append("node ");
			sb.append(i);
			sb.append(": key = ");
			sb.append(a[i]);
			if(i/2 > 0) {
				sb.append(", parent key = ");
				sb.append(a[i/2]);
			}
			if(i*2 <= n) {
				sb.append(", left key = ");
				sb.append(a[i*2]);
			}
			if(i*2+1 <= n) {
				sb.append(", right key = ");
				sb.append(a[i*2+1]);
			}
			sb.append(",");
			String s = sb.toString();
			System.out.println(s);
		}
		
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
