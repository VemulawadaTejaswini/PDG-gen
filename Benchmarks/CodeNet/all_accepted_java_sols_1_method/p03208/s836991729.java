import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] h = new int[N];

        for (int i = 0; i < N; i++) {
            h[i] = scan.nextInt();
        }
        Arrays.sort(h);
        int min = (int)Math.pow(10, 9);

        for (int i = 0; i <= N - K; i++) {
            if (h[i + K - 1] - h[i] < min) {
                min = h[i + K - 1] - h[i];
            }
        }

        scan.close();
        System.out.println(min);
    }
}