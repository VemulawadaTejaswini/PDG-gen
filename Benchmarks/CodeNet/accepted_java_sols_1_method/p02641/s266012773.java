import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        if (n == 0) {
            System.out.println(x);
            return;
        }
        
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = in.nextInt();
        }

        Arrays.sort(p);

        int dist = 0;
        while (true) {
            if (Arrays.binarySearch(p, x - dist) < 0) {
                System.out.println(x - dist);
                return;
            }
            if (Arrays.binarySearch(p, x + dist) < 0) {
                System.out.println(x + dist);
                return;
            }
            dist++;
        }
    }
}
