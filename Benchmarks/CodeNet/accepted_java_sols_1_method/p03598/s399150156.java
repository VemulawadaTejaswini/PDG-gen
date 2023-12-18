import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int dis1 = Math.abs(0 - x[i]);
            int dis2 = Math.abs(k - x[i]);
            sum += Math.min(dis1,dis2) * 2;
        }

        System.out.println(sum);
    }
}