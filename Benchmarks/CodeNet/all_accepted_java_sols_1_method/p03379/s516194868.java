import java.util.*;

public class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] tmp = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            tmp[i] = x[i];
        }

        Arrays.sort(x);
        int can1 = x[n/2];
        int can2 = x[n/2 - 1];
        for (int i = 0; i < n; i++) {
            if (tmp[i] <= can2) {
                System.out.println(can1);
            } else {
                System.out.println(can2);
            }
        }
    }
}