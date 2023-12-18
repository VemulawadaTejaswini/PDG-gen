import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long K = sc.nextInt();
        long[] A = new long[N+1];
        long[] B = new long[M+1];
      	A[0] = 0;
      	B[0] = 0;
        for (int i = 1; i < N + 1; i++) {
        	A[i] = A[i-1] + Long.parseLong(sc.next());
        }
        for (int i = 1; i < M + 1; i++) {
          	B[i] = B[i-1] + Long.parseLong(sc.next());
        }

        long sumTime = 0;
        int book = 0;
        int maxBook = 0;
      	int check = 0;
        for (int n = 0; n <= N; n++) {
            for (int m = 0; m <= M; m++) {
              	book = n + m;
            	sumTime = A[n] + B[m];
              	if (sumTime > K) {break;}
              	if (maxBook < book) {maxBook = book;}
            }
        }


        System.out.println(maxBook);

    }
}