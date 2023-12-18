import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        long ans = 0;
        for (int i = 0; i < n - 1; i++) {
            int wa = a[i] + a[i + 1];
            if (wa > x) {
                if (a[i] > x) {
                    ans += a[i] - x;
                    ans += a[i + 1];
                    a[i + 1] = 0;
                } else {
                    int sa = x - a[i];
                    ans += a[i + 1] - sa;
                    a[i + 1] = sa;
                }

            }
        }

        System.out.println(ans);
    }

}