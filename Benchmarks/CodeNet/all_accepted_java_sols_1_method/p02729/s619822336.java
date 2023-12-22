import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        int sum = 0;
        for (int i = 1; i < N; i++) {
            sum += i;
        }
        for (int i = 1; i < M; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}