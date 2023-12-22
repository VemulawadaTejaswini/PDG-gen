import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < k; i++) {
            int d = sc.nextInt();
            for (int j = 0; j < d; j++) {
                array[sc.nextInt() - 1]++;
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == 0) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}