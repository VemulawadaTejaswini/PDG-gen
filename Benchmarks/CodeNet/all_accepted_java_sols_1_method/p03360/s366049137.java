import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int max = 0;

        for (int i = 0; i <= k; i++) {
            for (int j = 0; j <= k - i; j++) {
                int h = k - i - j;
                int sum = a * (int)Math.pow(2, i) + b * (int)Math.pow(2, j) + c * (int)Math.pow(2, h);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}