import java.util.*;

public class Main {
    public static void main(String[] arg) throws java.io.IOException {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int n = scan.nextInt();
            if (n == 0)
                break;
            int[] a = new int[n];
            int max = -500000000;
            for (int i = 0; i < n; i++)
                a[i] = scan.nextInt();
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = i; j < n; j++) {
                    sum += a[j];
                    max = Math.max(max, sum);
                }
            }
            System.out.println(max);
        }
    }
}