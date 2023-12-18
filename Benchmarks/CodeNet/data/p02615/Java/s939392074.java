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
        long ans = a[0];
        ans += a[1];
        for (int i = 3; i < a.length; i++) {
            ans += a[i - 2];
        }
        System.out.println(ans);
    }
}