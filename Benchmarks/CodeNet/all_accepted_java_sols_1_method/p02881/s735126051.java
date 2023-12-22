import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long f = (long) Math.ceil(Math.sqrt(N));
        long min = N - 1;
        for (long i = 1; i <= f; i++) {
            if (N % i != 0) {
                continue;
            }
            if (N / i + i - 2 <= min) {
                min = N / i + i - 2;
            }
        }
        System.out.println(min);
    }
}