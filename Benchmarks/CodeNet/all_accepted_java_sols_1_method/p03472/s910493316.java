import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int[][] swords = new int[n][2];
        for (int i = 0; i < n; i++) {
            int[] xs = new int[2];
            xs[0] = sc.nextInt();
            xs[1] = sc.nextInt();
            swords[i] = xs;

            if (xs[0] > max) {
                max = xs[0];
            }
        }
        Arrays.sort(swords, (x, y) -> y[1] - x[1]);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (h <= 0) {
                System.out.println(count);
                return;
            }

            int[] sword = swords[i];
            if (sword[1] <= max) {
                break;
            }
            h -= sword[1];
            count++;
        }

        System.out.println((int) Math.ceil(((double) h) / max) + count);
    }
}
