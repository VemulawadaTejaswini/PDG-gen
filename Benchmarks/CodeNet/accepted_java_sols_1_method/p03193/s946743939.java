import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int h = std.nextInt();
        int w = std.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = std.nextInt();
            b[i] = std.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            int ai = a[i];
            int bi = b[i];
            if (ai >= h && bi >= w) {
                count++;
            }
        }

        System.out.println(count);
    }
}