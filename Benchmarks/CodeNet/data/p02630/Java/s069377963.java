import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        long ans = 0;
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
            ans += a[i];
        }
        int q = Integer.parseInt(sc.next());
        for (int i = 0; i < q; i++) {
            Arrays.sort(a);
            int b = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());
            for (int j = 0; j < n; j++) {
                int temp = a[j];
                if (temp > b) {
                    break;
                } else if (temp == b) {
                    ans -= temp;
                    ans += c;
                    a[j] = c;
                }
            }
            System.out.println(ans);
        }
    }
}