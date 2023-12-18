import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        if (Math.abs(N-M) >= 2) {
            System.out.println(0);
            return;
        }
        long count = 1;
        if (N != M) {
            for (int i = N; i > 0; i--) {
                count *= i;
                count %= 1000000007;
            }
            for (int i = M; i > 0; i--) {
                count *= i;
                count %= 1000000007;
            }
        } else {
            for (int i = N; i > 0; i--) {
                count *= i;
                count %= 1000000007;
            }
            for (int i = M; i > 0; i--) {
                count *= i;
                count %= 1000000007;
            }
            count = (count*2)%1000000007;
        }
        System.out.println(count);
    }
}