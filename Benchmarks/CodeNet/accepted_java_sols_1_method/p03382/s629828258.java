import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong() * 2;
        }
        Arrays.sort(a);
        long maxR = a[0];
        long maxN = a[n-1];
        for (int i = 1; i < n; i++) {
            if (Math.abs(maxN/2 - maxR) > Math.abs(maxN/2 - a[i])) {
                maxR = a[i];
            }
        }
        System.out.println(maxN/2 + " " + maxR/2);
    }
}