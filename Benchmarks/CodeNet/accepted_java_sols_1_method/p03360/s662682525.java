import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		
		int[] x = {A, B, C};
		Arrays.sort(x);
		
		for(int i = 1; i <= K; i++) {
			x[2] *= 2;
		}
		
		System.out.println(x[0] + x[1] + x[2]);
		
	}
}
