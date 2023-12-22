import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = sc.nextInt();
        }

        int minv = r[0];
        int maxv = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            maxv = Math.max(maxv, r[i] - minv);
            minv = Math.min(minv, r[i]);
        }
        System.out.println(maxv);
    }
}

