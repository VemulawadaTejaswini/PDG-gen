import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int m = 10;
        int d = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            int q = a[i] % 10;
            if (q != 0 && q < m) {
                m = q;
                d = i;
            }
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (i == d) {
                continue;
            }
            if (a[i] % 10 != 0) {
                sum += ((a[i] / 10) + 1) * 10;
            } else {
                sum += a[i];
            }
        }
        sum += a[d];
        System.out.println(sum);
        sc.close();
    }
}