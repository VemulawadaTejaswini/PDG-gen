import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	private void doit() {
		while (true) {
			int n = sc.nextInt();
			if(n == 0) break;
			int m = sc.nextInt();
			int sum = 0;
			while(m-- > 0){
				int start = sc.nextInt();
				int end = sc.nextInt();
				sum += end - start;
			}
			System.out.println(sum >= n ? "OK" : n - sum);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}