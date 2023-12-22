import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =  sc.nextInt();
		long A[] = new long[N];
		for(int i=0;i<N;i++) {
			A[i] = sc.nextLong();
		}
		long min = A[0];
		int count =0;
		for(int i=0;i<N;i++) {
			if (A[i]<=min) {
				count ++;
				min = A[i];
			}
		}
		System.out.println(count);
		return ;
	}
}