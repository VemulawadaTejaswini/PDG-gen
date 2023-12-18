import java.util.Scanner;

public class Main {
	
	static int fib(int n) {
		int[] fib = new int[n+1];
		fib[0] = 1;
		fib[1] = 1;
		for(int i=2;i<=n;i++) {
			fib[i] = fib[i-1]+fib[i-2];
		}
		return fib[n];
	}
	
	void main() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fib(n));
	}

	public static void main(String[] args) {
		new Main().main();
	}
}

