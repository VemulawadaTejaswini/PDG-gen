import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        long ans = 0;

        for (int i = 0; i < n; i++) {
            if (k >= n) {
                break;
            }

            if (i < n - k) {
                ans += array[i];
            } else {
                break;
            }
        }

        System.out.println(ans);

    }
}