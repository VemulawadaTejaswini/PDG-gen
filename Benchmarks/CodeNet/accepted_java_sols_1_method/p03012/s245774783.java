import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] W = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int w = scan.nextInt();
            W[i] = w;
            sum += w;
        }
        int answer = Integer.MAX_VALUE;
        for (int t = 1; t <= N; t++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 1; i <= N; i++) {
                if (i <= t) {
                    sum1 += W[i-1];
                } else {
                    sum2 += W[i-1];
                }
            }
            answer = Math.min(answer, Math.abs(sum1 - sum2));
        }
        System.out.println(answer);
    }
}
