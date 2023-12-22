import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n]; int[] B = new int[n];
		for(int i = 0 ; i < n ; i++) {
			A[i] = sc.nextInt();
			B[i] = 0;
		}
		int ans = 1;
		for(int i = 0 ; i < n ; i++) {
			ans *= 3;
		}
		int cnt = 1;
		for(int i = 0 ; i < n ; i++) {
			if(A[i] % 2 == 0) {
				B[i] = 2;
			} else {
				B[i] = 1;
			}
		}
		for(int i = 0 ; i < n ; i++) {
			cnt *= B[i];
		}
		System.out.println(ans - cnt);
	}
}
