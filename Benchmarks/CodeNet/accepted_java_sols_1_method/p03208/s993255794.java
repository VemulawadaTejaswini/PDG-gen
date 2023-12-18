import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        Arrays.sort(h);
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < n - k + 1; i++) {
            diff = Math.min(diff, h[k+i-1] - h[i]);
        }

        System.out.println(diff);
    }
}