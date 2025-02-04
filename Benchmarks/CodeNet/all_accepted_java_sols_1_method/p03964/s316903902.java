import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] T = new int[N];
		int[] A = new int[N];
		for(int i = 0 ; i < N ; i++) {
			T[i] = sc.nextInt();
			A[i] = sc.nextInt();
		}
		//得点:x,y  何倍:n
		long x = 1, y = 1, n;
		for(int i = 0 ; i < N ; i++) {
			if(x % T[i] != 0) {
				x = (x / T[i] + 1) * T[i];
			}
			if(y % A[i] != 0) {
				y = (y / A[i] + 1) * A[i];
			}
			n = Math.max(x / T[i], y / A[i]);
			x = n * T[i];
			y = n * A[i];
		}
		System.out.println(x + y);
	}
}
