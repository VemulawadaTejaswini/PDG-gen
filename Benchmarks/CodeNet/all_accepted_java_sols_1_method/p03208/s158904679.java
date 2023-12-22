import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < h.length; i++) {
            h[i] = sc.nextInt();
        }
        Arrays.sort(h);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n - k + 1; i++) {
            int tmp = h[i + k - 1] - h[i];
            min = Math.min(min, tmp);
        }
        System.out.println(min);
    }
}