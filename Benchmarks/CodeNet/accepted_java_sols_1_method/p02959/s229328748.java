import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n + 1];
        int b[] = new int[n];
        for (int i = 0; i < n + 1; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }

        long total = 0;
        for (int i = 0; i < n; i++) {
            if (b[i] <= a[i]) {
                total += b[i];
            } else {
                b[i] -= a[i];
                total += a[i];
                
                int nextBaster = Math.min(a[i + 1], b[i]);
                total += nextBaster;
                a[i + 1] -= nextBaster;
            }
        }
        System.out.println(total);
    }
}