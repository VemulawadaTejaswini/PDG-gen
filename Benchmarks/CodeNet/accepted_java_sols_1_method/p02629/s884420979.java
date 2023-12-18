import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong() - 1;
        long base = 26;
        int idx = 0;
        long[] counts = new long[10];
        for (int i = 0; i < 11; i++) {
            if (n - base < 0) {
                idx = i;
                break;
            }
            n -= base;
            base *= 26;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= idx; i++) {
            sb.append((char)(n % 26 + 'a'));
            n /= 26;
        }
        System.out.println(sb.reverse());
    }
}