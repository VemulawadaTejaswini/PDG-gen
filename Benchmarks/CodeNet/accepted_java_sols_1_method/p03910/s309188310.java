import java.util.*;

public class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val  =1;
        for (int i = 1; i <= n; i++) {
            int past = i * (i-1) / 2;
            int next = i * (i+1) / 2;
            if (past <= n && n <= next) {
                val = i;
                break;
            }
        }

        int diff = val * (val + 1) / 2 - n;

        for (int i = val; i > 0 ; i--) {
            if (diff >= i) {
                diff -= i;
            } else {
                System.out.println(i);
            }
        }

        System.out.println();
    }
}