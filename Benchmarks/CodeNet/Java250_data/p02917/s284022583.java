import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] B = new int[N-1];
		int[] A = new int[N];
		for(int i=0; i<N-1; i++) {
			B[i] = sc.nextInt();
		}
		A[0]=B[0];
		A[N-1]=B[N-2];
		for(int i=1; i<N-1; i++) {
			if(B[i]>B[i-1]) {
				A[i]=B[i-1];
			}else {
				A[i]=B[i];
			}
		}
		int x=0;
		for(int i=0; i<N; i++) {
			x = x + A[i];
		}
		System.out.println(x);
	}
}

