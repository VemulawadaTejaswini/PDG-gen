import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long K = sc.nextLong();
        sc.close();

        if (K % 2 == 0) {
            System.out.println("-1");
            return;
        }

        long[] array = new long[1000001];
        array[0] = 7 % K;

        for (int i = 1; i <= K; i++) {
            array[i] = (10 * array[i - 1] + 7) % K;
        }

        for (int i = 0; i <= K; i++) {
            if (array[i] == 0) {
                System.out.println(i + 1);
                return;
            }
        }

        System.out.println("-1");

    }
}
