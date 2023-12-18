import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] A = new int[n];
		long sum = 0;
		
		for(int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
			sum += A[i];
		}
		
		Arrays.sort(A);
		
		System.out.println(A[0] + " " + A[n - 1] + " " + sum);
		
		sc.close();
	}

}

