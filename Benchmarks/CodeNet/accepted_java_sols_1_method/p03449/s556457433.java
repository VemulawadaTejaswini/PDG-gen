import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a1 = new int[n];
        int[] a2 = new int[n];

        for (int i = 0; i < n; i++) {
            a1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a2[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 1; i < n + 1; i++) {
            int n1 = 0;
            int n2 = 0;
            for (int j = 0; j < i; j++) {
                n1 += a1[j];
            }
            for (int k = i -1; k < n; k++) {
                n2 += a2[k];
            }
            sum = Math.max(sum, n1 + n2);
        }
        System.out.println(sum);
    }
}
