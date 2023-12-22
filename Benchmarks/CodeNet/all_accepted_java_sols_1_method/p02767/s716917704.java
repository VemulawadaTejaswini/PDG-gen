
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        int[] p = new int[n];
        int result = 0;
        int tempX = 0;
        for (int i = 0; i < n; i++) {
            p[i] = in.nextInt();
            tempX += 2 * p[i];
            result += p[i] * p[i];
        }
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= 100; i++) {
            min = Math.min(min, n * i * i - tempX * i);
        }
        System.out.println(result + min);
    }
}
