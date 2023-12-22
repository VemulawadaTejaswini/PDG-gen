import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = std.nextInt();
        }
        int max = p[0];
        int count = 0;
        for (int i = 0; i < n; i++) {
            int value = p[i];
            if (value <= max) {
                count++;
            }

            max = Math.min(max, value);
        }

        System.out.println(count);
    }
}
