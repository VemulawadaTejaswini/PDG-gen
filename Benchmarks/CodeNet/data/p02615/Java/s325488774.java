import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(a, Collections.reverseOrder());
        long ans = 0;
        for (int i = 1; i < a.length; i++) {
            if (i >= 3) {
                ans += a[i - 2];
            } else {
                ans += a[i - 1];
            }
        }
        System.out.println(ans);
    }
}