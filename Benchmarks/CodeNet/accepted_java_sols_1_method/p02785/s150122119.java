import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; ++i) {
            h[i] = s.nextInt();
        }
        Arrays.sort(h);
        long sum = 0;
        for (int i = 0; i < n - k; ++i) sum += h[i];
        System.out.println(sum);
    }
}
