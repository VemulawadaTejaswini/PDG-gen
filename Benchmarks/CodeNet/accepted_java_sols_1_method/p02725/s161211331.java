import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int min;
        int K = stdIn.nextInt();
        int N = stdIn.nextInt();

        int[] distances = new int[N];

        for (int i = 0; i < N; i++) {
            distances[i] = stdIn.nextInt();
        }

        stdIn.close();

        int max = distances[0] + K - distances[N-1];
        for (int i = 0; i < N-1; i++) {
            if (max < distances[i+1] - distances[i]) {
                max = distances[i+1] - distances[i];
            }
        }

        System.out.println(K - max);

    }
}