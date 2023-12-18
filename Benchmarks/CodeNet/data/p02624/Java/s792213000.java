
import java.util.Scanner;

public class Main {
    private static long[] SOD;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long N = scn.nextLong();
        getSumOfDivisble(N);
        long res = 0;
        for (int i = 1; i <= N; i++) {
            res += SOD[i] * i;
        }
        System.out.println(res);

    }

    public static void getSumOfDivisble(long N) {
        SOD = new long[10000000 + 10];
        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j += i) {
                SOD[j] += 1;
            }
        }
    }

}