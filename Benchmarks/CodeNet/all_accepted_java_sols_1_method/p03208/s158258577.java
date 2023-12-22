import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = Integer.parseInt(s.next());
        int k = Integer.parseInt(s.next());

        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(s.next());
        }

        int[] sored = Arrays.stream(h).sorted().toArray();

        int min = 999999999;

        for (int i = 0; i < n - k + 1; i++) {
            int tmp = Math.abs(sored[i] - sored[i + k - 1]);
            if (min > tmp) {
                min = tmp;
            }
        }

        System.out.println(min);
    }
}