import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[][] sum = new long[8][N];

		long[] xyz = new long[3*N];
		for(int i=0; i<3*N; i++) {
			xyz[i] = sc.nextLong();
		}

		for(int j=0; j<N; j++) {
			sum[0][j] = xyz[j*3] + xyz[j*3+1] +xyz[j*3+2];
			sum[1][j] = xyz[j*3] + xyz[j*3+1] -xyz[j*3+2];
			sum[2][j] = xyz[j*3] - xyz[j*3+1] +xyz[j*3+2];
			sum[3][j] = xyz[j*3] - xyz[j*3+1] -xyz[j*3+2];
			sum[4][j] = -xyz[j*3] + xyz[j*3+1] +xyz[j*3+2];
			sum[5][j] = -xyz[j*3] + xyz[j*3+1] -xyz[j*3+2];
			sum[6][j] = -xyz[j*3] - xyz[j*3+1] +xyz[j*3+2];
			sum[7][j] = -xyz[j*3] - xyz[j*3+1] -xyz[j*3+2];
		}for(int m=0; m<8; m++) {
			Arrays.sort(sum[m]);
		}//System.out.println(sum[0][N-1]); //ここまで合ってるはず

		long[] P = new long[8];
		for(int k=0; k<8; k++) {
			for(int l=0; l<M; l++) {
				P[k] += sum[k][N-1-l];
			}
		}Arrays.sort(P);

		System.out.println(P[7]);

	}

}
