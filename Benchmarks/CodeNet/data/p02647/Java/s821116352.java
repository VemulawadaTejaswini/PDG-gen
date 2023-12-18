import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }

        boolean flag = true;
        while (flag) {
            K--;
            int[] A_imos = new int[N+1];
            for (int i=0;i<N;i++) {
                A_imos[Math.max(0, i-A[i])]++;
                A_imos[Math.min(N, i+A[i]+1)]--;
            }
            for (int i=0;i<N;i++) {
                A_imos[i+1] = A_imos[i+1]+A_imos[i];
            }

            boolean all_equal = true;
            for (int i=0;i<N;i++) {
                if (A[i] != A_imos[i]) all_equal = false;
                A[i] = A_imos[i];
            }
            if (all_equal) flag = false;
            if (K == 0) flag = false;
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<N;i++) {
            sb.append(A[i]);
            if (i != N-1) sb.append(" ");
        }
        System.out.println(sb);
    }
}