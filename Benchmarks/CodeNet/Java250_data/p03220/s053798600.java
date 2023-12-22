import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();
        final int t = sc.nextInt();
        final int a = sc.nextInt();
        final int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        int index = -1;
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            final double x = t - h[i] * 0.006;
            final double near = Math.abs(a-x);
            if (near < min) {
                index = i;
                min = near;
            }
        }

        System.out.println(index+1);
    }
}
