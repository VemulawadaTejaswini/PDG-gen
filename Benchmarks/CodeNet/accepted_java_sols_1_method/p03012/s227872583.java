import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] W = new int[N];

        int sum1 = 0;

        for (int i = 0; i < N; i++) {
            W[i] = sc.nextInt();
            sum1 += W[i];
        }

        int sum2 = 0;

        int m_sum = 1000000000;

        for (int i = 0; i < N; i++) {
            sum1 -= W[N - 1 - i];
            sum2 += W[N - 1 - i];
            if (Math.abs(sum1 - sum2) < m_sum) {
                m_sum = Math.abs(sum1 - sum2);
            }
        }

        System.out.println(m_sum);

        sc.close();
        ;
    }
}