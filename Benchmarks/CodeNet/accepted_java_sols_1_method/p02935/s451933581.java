import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] V = new int[N];
        for (int i = 0; i < N; i++) {
            V[i] = sc.nextInt();
        }
        Arrays.sort(V);

        long sum = V[0] + V[1];
        long mul = 2;
        for (int i = 2; i < N; i++) {
            sum += V[i] * mul;
            mul *= 2;
        }

        double ans = ((double)sum) / (double)(1L<<(N-1));
        System.out.println(ans);
    }
}