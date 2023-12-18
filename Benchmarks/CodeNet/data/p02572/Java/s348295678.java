import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[]A = new int[N+1];
		for(int x = 1; x<N+1 ; x++) {
			A[x] = sc.nextInt();
		}
		int sum = 0;

		for(int i = 1; i<=N-1; i++) {
			//i=1のときのシグマ
			for(int j = i+1; j<=N;j++) {
				sum += A[i] * A[j];
			}
		}
		System.out.print(sum%1000000007);

    }

	static int min(int x,int y) {
		if(x>y) {
		return y;
		}
		else if(x<y) {
			return x;
		}
		else
			return x;
	}
}



//  A[0]A[1]A[2]A[3]
//  null  1   2  3


