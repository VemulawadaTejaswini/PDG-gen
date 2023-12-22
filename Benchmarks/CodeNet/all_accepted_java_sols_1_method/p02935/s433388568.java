import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] A = new double[N];
		double tmp;
		double ans = 0;
		for(int i=0;i<N;i++) {
			A[i] = sc.nextDouble();
 		}
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				if(A[i] > A[j]) {
					tmp = A[i];
					A[i] = A[j];
					A[j] = tmp;
				}
			}
		}
		for(int i=0;i<N;i++) {
			ans += A[i]/Math.pow(2,N-i);
			if(i == 0) {
				ans += A[i]/Math.pow(2,N-i);
			}
		}
		System.out.println(ans);
	}
}