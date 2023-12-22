import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int left = 0;
        int right = 0;
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            if (x < a[i])
                right++;
            else
                left++;
        }
        System.out.println(Math.min(right, left));
    }
}