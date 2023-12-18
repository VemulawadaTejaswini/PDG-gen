import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long K = sc.nextLong();
		long A[]=  new long[N];
		long B[] = new long[M];
		long sumA[] = new long[N];
		long sumB[] = new long[M];
		for (int i=0;i<N;i++) {
			A[i] = sc.nextLong();
			if (i>0) {
				sumA[i] =A[i]+sumA[i-1];
			} else {
				sumA[i] =A[i];
			}
		}
		for (int i=0;i<M;i++) {
			B[i] = sc.nextLong();
			if (i>0) {
				sumB[i] =B[i]+sumB[i-1];
			} else {
				sumB[i] =B[i];
			}
		}
		int nowj=M-1;
		while (nowj>=0&&sumB[nowj]>K) {
			nowj--;
		}
		int maxi =N-1;
		while (maxi>=0&&sumA[maxi]>K) {
			maxi--;
		}
		int count =Math.max(nowj+1, maxi+1);
		for (int i=0;i<N;i++) {
			if (sumA[i]>K) {
				break;
			}
			if (nowj+2+i<=count) {
				break;
			}
			while (nowj>=0&&sumA[i]+sumB[nowj]>K) {
				nowj--;
			}
			if (nowj+2+i>count) {
				count = nowj+2+i;
			}
		}
		System.out.println(count);
	}
}