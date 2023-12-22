import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        int cnt = 0;
        boolean is_odd = false;
        while (!is_odd) {
            for (int i=0;i<n;i++) {
                if ((a[i] & 1) == 0) {
                    a[i] >>= 1;
                } else {
                    is_odd = true;
                    break;
                }
            }
            if (!is_odd)
                cnt++;
        }
        System.out.println(cnt);
    }
}
