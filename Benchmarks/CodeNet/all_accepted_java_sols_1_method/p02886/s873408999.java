import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = std.nextInt();
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i == j) {
                    continue;
                }

                sum += d[i] * d[j];
            }
        }

        System.out.println(sum);
    }
}
