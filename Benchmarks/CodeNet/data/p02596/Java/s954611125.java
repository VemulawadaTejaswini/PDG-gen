import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int K = s.nextInt();
        int n = 7 % K;
        for (int i = 1; i <= K + 1; i++) {
            if (n == 0) {
                System.out.println(i);
                break;
            } else if (i == K + 1) {
                System.out.println(-1);
                break;
            }
            n = 7 + (10 * n);
            n = n % K;
        }
    }
}