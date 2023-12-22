import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        long[] h = new long[n];
        for (int i = 0; i < n; i++) {
            h[i] = std.nextInt();
        }

        boolean isNone = false;
        for (int i = n - 1; i > 0; i--) {
            long diff = h[i] - h[i - 1];
            if (diff < 0) {
                diff++;
                h[i - 1] = h[i - 1] - 1;
            }

            if (diff < 0) {
                isNone = true;
                break;
            }
        }

        if (isNone) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
