import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		for(int i = 0; i < n/2; i++) {
			int tmp = A[i];
			A[i] = A[n-i-1];
			A[n-i-1] = tmp;
		}
		System.out.printf("%d", A[0]);
		for(int i = 1; i < n; i++) {
			System.out.printf(" %d", A[i]);
		}
		System.out.println();
	}
}	
