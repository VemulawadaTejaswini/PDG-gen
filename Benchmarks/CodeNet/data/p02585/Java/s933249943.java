import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] P = new int[N];
        long[] C = new long[N];
        for (int i = 0; i < N; i++) {P[i] = sc.nextInt();}
        for (int i = 0; i < N; i++) {C[i] = sc.nextInt();}

        long max = 0;
        int c = 0;
        long sum = 0;
        int x = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= K; j++) {
                x = i;
                c = 0;
                sum = 0;
                while (c < j) {
                    x = P[x] - 1;
                    sum += C[x];
                    c++;
                }
                if (i == 0) {
                    max = sum;
                } else {
                    if (sum > max) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}