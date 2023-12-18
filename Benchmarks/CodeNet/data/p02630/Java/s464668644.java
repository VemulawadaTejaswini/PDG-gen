import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int j=0; j<n; j++) {
            a[j] = sc.nextInt();
        }
        int q = sc.nextInt();
        for (int i=0; i<q; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();

            long sum  = 0;
            for (int j=0; j<n; j++) {
                if (a[j] == b) {
                    a[j] = c;
                }
                sum += a[j];
            }
            System.out.println(sum);
        }
    }
}