import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int[] F;
	boolean[] flag;
	void run() {
		Scanner sc = new Scanner(System.in);
		F = new int[50];
		flag = new boolean[50];
		int ans = fib(sc.nextInt());
		System.out.println(ans);
		sc.close();
	}
	
	int fib(int n) {
		if(n == 0 || n == 1) return 1;
		if(flag[n]) return F[n];
		F[n] = fib(n-1) + fib(n-2);
		flag[n] = true;
		return F[n];
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
