import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int N;
        String S;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            S = sc.next();
        }
        char[] carr = S.toCharArray();
        int[] west = new int[N];
        int[] east = new int[N];

        int sum = 0;
        for (int i = 0; i < N; i++) {
            west[i] = sum;
            if (carr[i] == 'W') {
                sum++;
            }
        }
        sum = 0;
        for (int i = N - 1; i >= 0; i--) {
            east[i] = sum;
            if (carr[i] == 'E') {
                sum++;
            }
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (west[i] + east[i] < result) {
                result = west[i] + east[i];
            }
        }
        System.out.println(result);
    }
}
