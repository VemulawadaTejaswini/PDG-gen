import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        long[] array = new long[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        long ans = 0;

        for (int i = 1; i < n; i++) {
            ans += Math.min((array[i] - array[i - 1]) * a, b);
        }
        System.out.println(ans);
    }
}