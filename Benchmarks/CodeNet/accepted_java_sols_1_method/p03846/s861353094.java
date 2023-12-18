import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] A = new int[N];
		long c = 1000000007;
		
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			A[a]++;
		}
		
		long ans = 1;

		if(N % 2 == 0) {
			for(int i = 1; i < N; i += 2) {
				if(A[i] != 2) {
					System.out.println(0);
					return;
				} else {
					ans = ans % c * 2 % c;
				}
			}
			System.out.println(ans);
		} else {
			if(A[0] != 1) {
				System.out.println(0);
				return;
			}
			for(int i = 2; i < N; i += 2) {
				if(A[i] != 2) {
					System.out.println(0);
					return;
				} else {
					ans = ans % c * 2 % c;
				}
			}
			System.out.println(ans);
		}
				
	}
}
