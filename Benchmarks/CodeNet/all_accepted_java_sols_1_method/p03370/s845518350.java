import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            X -= n;
            if (min > n) {
                min = n;
            }
        }
        System.out.println(N + X / min);
    }
}