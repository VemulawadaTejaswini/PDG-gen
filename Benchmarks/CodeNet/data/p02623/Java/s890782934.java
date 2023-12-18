import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }
        long sum = 0;
        int i = 0;
        while (i < N && sum+A[i] <= K) {
            sum += A[i];
            i++;
        }
        int j = 0;
        while (j < M && sum+B[j] <= K) {
            sum += B[j];
            j++;
        }
        int ans = i+j;
        while (i > 0) {
            sum -= A[--i];
            while (j < M && sum+B[j] <= K) {
                j++;
            }
            Math.max(ans,i+j);
        }

        System.out.println(ans);
    }
}
