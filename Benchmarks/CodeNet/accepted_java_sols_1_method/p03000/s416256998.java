import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int X = sc.nextInt();

        final int[] L = new int[N];
        for (int i = 0; i < N; i++) {
            L[i] = sc.nextInt();
        }

        int[] ans = new int[N+1];
        ans[0] = 0;
        for (int i = 1; i < N+1; i++) {
            ans[i] = ans[i-1] + L[i-1];
        }

        System.out.println(IntStream.of(ans).filter(i -> i <= X).count());
    }
}
