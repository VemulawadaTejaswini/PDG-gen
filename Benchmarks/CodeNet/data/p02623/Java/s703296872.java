import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int N = scan.nextInt();
                int M = scan.nextInt();
                long K = scan.nextLong();

                long[] A = new long[N];
                long[] B = new long[M];

                for (int n = 0; n < N; n++) {
                	A[n] = scan.nextLong();
                	if (n > 0) {
                		A[n] += A[n-1];
                	}
                }

                for (int m = 0; m < M; m++) {
                	B[m] = scan.nextLong();
                	if (m > 0) {
                		B[m] += B[m-1];
                	}
                }

                int Aposition = N-1;
                int Bposition = 0;

                int max = 0;

                while (Aposition >= 0) {
                	if (A[Aposition] <= K) {
                		long nokori = K - A[Aposition];
	                	while (Bposition+1 < M && nokori >= B[Bposition+1]) {
	                		Bposition++;
	                	}
                		if (max < Aposition+1 + Bposition+1) {
                			max = Aposition+1 + Bposition+1;
                		}
                	}
            		Aposition--;
                }

                System.out.println(max);

                scan.close();

        }

}