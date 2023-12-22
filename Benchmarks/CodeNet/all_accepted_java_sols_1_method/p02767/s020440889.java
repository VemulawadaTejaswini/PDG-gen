import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int[] X =new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = stdIn.nextInt();
        }
        stdIn.close();

        Arrays.sort(X);

        int[] sum = new int[X[N-1] - X[0] + 1];
        for (int i = 0; i <= X[N-1] - X[0]; i++) {
            for (int j = 0; j < N; j++) {
                sum[i] += Math.pow(X[j] - (X[0] + i), 2);
            }
        }

        Arrays.sort(sum);
        System.out.println(sum[0]);
    }
}