import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            if (x < min) {
                min = x;
            }
            if (max < x) {
                max = x;
            }
            sum = sum + x;
        }

        System.out.printf("%d %d %d", min, max, sum);
        System.out.println();
        System.exit(0);
    }
}

