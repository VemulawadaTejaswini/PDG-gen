import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int M = sc.nextInt();
        int[] a_array = new int[A];
        int[] b_array = new int[B];

        int a_min = 100000;
        int b_min = 100000;
        for (int i = 0; i < A; i++) {
            a_array[i] = sc.nextInt();
            a_min = Math.min(a_min, a_array[i]);
        }
        for (int i = 0; i < B; i++) {
            b_array[i] = sc.nextInt();
            b_min = Math.min(b_min, b_array[i]);
        }

        int ans = a_min + b_min;
        int sum;
        for (int i = 0; i < M; i++) {
            sum = a_array[sc.nextInt() - 1] + b_array[sc.nextInt() - 1] - sc.nextInt();
            ans = Math.min(ans, sum);
        }

        System.out.println(ans);
    }
}