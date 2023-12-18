import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int l = 0;
        int r = (int)Math.pow(10, 9);
        while (r - l > 1) {
            int x = (l + r) / 2;
            long now = 0;
            for (int i = 0; i < a.length; i++) {
                now += (a[i] - 1) / x;
            }
            if (now <= k) {
                r = x;
            } else {
                l = x;
            }
        }
        System.out.println(r);
    }

}
