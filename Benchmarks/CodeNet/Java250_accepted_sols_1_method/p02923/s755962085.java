import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] H = new int[N];
        for (int i = 0; i < N; i++)
            H[i] = sc.nextInt();
        sc.close();

        int count = 0;
        int maxMv = 0;

        for (int i = 0; i < N - 1; i++) {
            if (H[i] >= H[i + 1]) {
                count++;
                if (i == N - 2) {
                    if (maxMv < count) {
                        maxMv = count;
                    }
                }
            } else {
                if (maxMv < count) {
                    maxMv = count;
                }
                count = 0;
            }
        }

        System.out.println(maxMv);


    }
}