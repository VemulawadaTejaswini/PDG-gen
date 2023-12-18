import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		int K = stdIn.nextInt();
		int[] A = new int[N];
		int[] B = new int[M];
		int[] a = new int[N+1];
		int[] b = new int[M+1];
		a[0] = 0;
		b[0] = 0;
		int ans = 0;
		for(int i=1;i<N;i++) {
			a[i+1] = a[i] + A[i];
		}
		for(int i=1;i<M;i++) {
			b[i+1] = b[i] + B[i];
		}

		int j = M;
		for(int i=0;i<N+1;i++) {
			if(a[i]>K) {
				break;
			}
			while(b[j]>K-a[i]) {
				j--;
			}
			ans = Math.max(i,j);
		}
		System.out.println(ans);
		stdIn.close();
	}
}