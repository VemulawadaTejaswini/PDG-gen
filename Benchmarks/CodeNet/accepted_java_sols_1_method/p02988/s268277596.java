import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = in.nextInt();
        }

        int count = 0;
        for (int i = 1; i < n - 1; i++) {
            if (p[i] < Math.max(p[i - 1], p[i + 1]) &&
            p[i] > Math.min(p[i - 1], p[i + 1])) {
                count++;
            }
        }

        System.out.println(count);

    }
}
