import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
            a[i] = sc.nextInt();
        }
        long left = t[0];
        long right = a[0];
        for (int i = 1; i < n; i++) {
            long hidari = t[i];
            long migi = a[i];
            if (left <= hidari && right <= migi) {
                left = hidari;
                right = migi;
            } else {
                long c = left / hidari;
                if (left % hidari != 0) {
                    c++;
                }
                long b = right / migi;
                if (right % migi != 0) {
                    b++;
                }
                long max = Math.max(c, b);
                left = hidari * max;
                right = migi * max;
            }
        }
        System.out.println(left + right);
        sc.close();
    }
}