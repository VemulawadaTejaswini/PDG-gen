import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long K = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[M];
        for (int i = 0; i < N; i++) {A[i] = Integer.parseInt(sc.next());}
        for (int i = 0; i < M; i++) {B[i] = Integer.parseInt(sc.next());}

        long sumTime = 0;
        int book = 0;
        int maxBook = 0;
        for (int n = 0; n <= N; n++) {
            for (int m = 0; m <= M; m++) {
              	book = n + m;
            	sumTime = 0;
              	for (int i = 0; i < n; i++) {
                  	sumTime += (long) A[i];
                }
              	for (int j = 0; j < m; j++) {
                	sumTime	+= (long) B[j];
                }
              	
              	if ((maxBook < book) && (sumTime <= K)) {maxBook = book;}
            }
        }


        System.out.println(maxBook);

    }
}