import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] hist = new int[M];
 
        for (int i =0; i<N; i++) {
            int K = sc.nextInt();

            for (int j =0; j<K; j++) {
              int index = sc.nextInt() - 1;
                hist[index]++;
            }
        }

        int result = 0;
        for (int i = 0; i<M; i++) {
            if (hist[i] == N) {
                result++;
            }
        }

        System.out.println(result);
    }
}