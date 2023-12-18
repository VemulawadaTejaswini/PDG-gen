import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for (int i = -100; i <= 100; i++) {
            int total = 0;
            for (int j = 0; j < n; j++) {
                int s = (a[j] - i);
                total += s * s;
            }

            min = Math.min(min, total);
        }

        System.out.println(min);
    }
}