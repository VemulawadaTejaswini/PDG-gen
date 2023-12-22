import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n - 1];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            c[i] = sc.nextInt();
        }
        int cur = a[0] - 1;
        int s = b[cur];
        for (int i = 1; i < n; i++) {
            int next = a[i] - 1;
            s += b[next] + (next == cur + 1 ? c[cur] : 0);
            cur = next;
        }
        System.out.println(s);
    }
}
