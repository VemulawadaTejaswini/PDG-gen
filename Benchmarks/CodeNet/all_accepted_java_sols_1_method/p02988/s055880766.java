import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            if (p[i] < p[i + 1] && p[i + 1] < p[i + 2] || p[i + 2] < p[i + 1] && p[i + 1] < p[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
