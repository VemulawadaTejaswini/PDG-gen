import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		double [] B = new double[N];
		double S =0;
		for(int i=0; i<N; i++) {
			A[i]=sc.nextInt();
		}
		for(int i=0; i<N; i++) {
          	B[i]=1.0/A[i];
			S=S+B[i];
		}
		System.out.println(1.0/S);
	}
}

