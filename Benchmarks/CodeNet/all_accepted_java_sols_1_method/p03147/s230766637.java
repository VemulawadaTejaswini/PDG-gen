import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] h = new int[N + 2];
        for (int i = 1; i < h.length - 1; i++) {
            h[i] = sc.nextInt();
        }
        int counter = 0;
        int[] check = new int[h.length];
        while (!Arrays.equals(h, check)) {
            int m = 0;
            for (int i = 1; i < h.length - 1; i++) {
                if (m == 0 && h[i] != 0) {
                    counter++;
                }
                m = h[i];
                if (h[i] != 0) {
                    h[i]--;
                }
            }
        }
        System.out.println(counter);
        sc.close();
    }
}