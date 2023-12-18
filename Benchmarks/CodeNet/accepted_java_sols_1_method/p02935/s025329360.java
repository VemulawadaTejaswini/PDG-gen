import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double A[] = new double[N];
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextDouble();
		}
		Arrays.sort(A);
		for(int i = 0 ; i < N - 1 ; ++i){
			double next = (A[i] + A[i + 1]) / 2.0;
			A[i + 1] = next;
		}
		System.out.println(A[N - 1]);
	}
}
