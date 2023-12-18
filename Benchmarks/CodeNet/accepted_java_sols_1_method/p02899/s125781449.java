import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] A = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			int temp = sc.nextInt();
			A[i][0] = temp - 1; 
			A[i][1] = i + 1; 
		}
		Arrays.sort(A, (a1, a2) -> Integer.compare(a1[0], a2[0]));
		for(int i = 0; i < N; i++) {
			System.out.print(A[i][1] + " ");
		}
	}
}
