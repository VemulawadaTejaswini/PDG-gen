import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
		}
		Arrays.sort(A);
		int count = 1;
		for(int i = 0; i < N - 1; i++) {
			if(A[i] != A[i + 1]) {
				count++;
			}
		}
		if(count % 2 == 0) {
			count--;
		}
		
		System.out.println(count);
		scan.close();

	}

}
