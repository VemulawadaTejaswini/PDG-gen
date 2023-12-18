import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        long A[] = new long[N];
        for (int n = 0; n < N; n++) A[n] = sc.nextLong();
        long x = 0;
        final int DIGIT = 40;
        for (int i = DIGIT - 1; i >= 0; i--) {
            int count = 0;
            for (int j = 0; j < N; j++) count += (1 & (A[j] >> i));
            if (count <= N / 2) 
                if ((x | 1l << i) <= K) x = x | 1l << i;
        }
        long sum = 0;
        for (int i = 0; i < N; i++) sum += (x ^ A[i]);
        System.out.println(sum);
        sc.close();
    }
}
