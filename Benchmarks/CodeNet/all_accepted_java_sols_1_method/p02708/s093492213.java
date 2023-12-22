import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long K = sc.nextInt();
        long sum = 0;
        for (long i = Math.min(K, N + 1); i <= N + 1; i++) {
            long start = (0 + i - 1) * i / 2;
            long end = (N + N - i + 1) * i / 2;
            sum += (end - start + 1);

        }
        System.out.println(sum % 1000000007);
    }
}
