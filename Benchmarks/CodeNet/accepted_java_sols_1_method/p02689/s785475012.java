import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] H = new int[N];
            for (int i = 0; i < N; i++) {
                H[i] = sc.nextInt();
            }
            int[] A = new int[M];
            int[] B = new int[M];
            for (int i = 0; i < M; i++) {
                A[i] = sc.nextInt() - 1;
                B[i] = sc.nextInt() - 1;
            }

            ArrayList<Integer>[] nToN = new ArrayList[N];
            for (int i = 0; i < nToN.length; i++) {
                nToN[i] = new ArrayList<Integer>();
            }
            for (int i = 0; i < M; i++) {
                nToN[A[i]].add(B[i]);
                nToN[B[i]].add(A[i]);
            }

            int count = 0;
            for (int n = 0; n < N; n++) {
                ArrayList<Integer> ns = nToN[n];
                boolean isValid = true;
                for (int j = 0; j < ns.size(); j++) {
                    if (H[n] <= H[ns.get(j)]) {
                        isValid = false;
                    }
                }
                if (isValid) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
