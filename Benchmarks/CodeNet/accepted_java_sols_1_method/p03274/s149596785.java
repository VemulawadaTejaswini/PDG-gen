import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x[] = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        int sum = 1000000000;
        for (int i = 0; i + k - 1 < n; i++) {
            sum = Math.min(sum, Math.min(Math.abs(x[i]) + Math.abs(x[i + k - 1] - x[i]), Math.abs(x[i + k - 1]) + Math.abs(x[i + k - 1] - x[i])));
        }
        System.out.println(sum);
    }
}