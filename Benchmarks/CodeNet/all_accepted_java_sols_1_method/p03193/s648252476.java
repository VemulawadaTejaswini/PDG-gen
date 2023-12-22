import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long h = sc.nextLong();
        long w = sc.nextLong();
        long[] a = new long[n];
        long[] b = new long[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            b[i] = sc.nextLong();
            cnt += Math.min(a[i] / h, b[i] / w);
        }
        System.out.println(cnt);
    }

}
