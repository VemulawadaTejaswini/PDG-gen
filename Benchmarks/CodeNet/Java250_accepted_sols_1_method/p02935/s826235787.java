import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for (int i=0;i<N;i++) {
			A[i]= sc.nextInt();
		}
		Arrays.parallelSort(A);
		double now =(A[0]+A[1])/2.0;
		for (int i=2;i<N;i++) {
			now = (A[i]+now)/2.0;
		}
		System.out.println(now);
	}
}