import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int N = scan.nextInt();
                int M = scan.nextInt();
                long K = scan.nextLong();

                long[] A = new long[N+1];
                long[] B = new long[M+1];
                
                A[0] = 0;
                B[0] = 0;

                for (int n = 1; n <= N; n++) {
                	A[n] = A[n-1] + scan.nextLong();
                }

                for (int m = 1; m <= M; m++) {
                	B[m] = B[m-1] + scan.nextLong();
                }

                int Aposition = N;
                int Bposition = 0;

                int max = 0;

                while (Aposition >= 0) {
                	if (A[Aposition] <= K) {
                		long nokori = K - A[Aposition];
                		while (Bposition+1 < M && nokori >= B[Bposition+1]) {
                			Bposition++;
                		}
                		if (max < Aposition + Bposition) {
                			max = Aposition + Bposition;
                		}
                	}
            		Aposition--;
                }

                System.out.println(max);

                scan.close();

        }

}