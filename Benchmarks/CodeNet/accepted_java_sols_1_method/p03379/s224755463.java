import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N];
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
			A[i] = X[i];
		}
		Arrays.sort(X);

		int med1, med2;
		med1 = X[N/2 - 1];	//left
		med2 = X[N/2];	//right
		for (int i = 0; i < N; i++) {
			if(A[i] < med2) {
				System.out.println(med2);
			} else {
				System.out.println(med1);
			}
		}
	}
}