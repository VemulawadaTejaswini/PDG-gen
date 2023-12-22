import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        long l = 0;
        long m = 0;
        for (int i = n - 1; i > 0; i--) {
            if (a[i] == a[i - 1] && l == 0) {
                l = a[i];
                i--;
            } else if (a[i] == a[i - 1]) {
                m = a[i];
                break;
            }
        }
        System.out.println(l * m);
    }
}
