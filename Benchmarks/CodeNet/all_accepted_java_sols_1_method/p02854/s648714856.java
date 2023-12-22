import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        long[] sum = new long[n+1];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum[i+1] = sum[i] + (long)a[i];
        }

        int index = 1;
        long min = Long.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            long l = sum[i];
            long r = sum[n] - sum[i];
            long dis = Math.abs(l-r);
            if (dis < min) {
                index = i;
                min = dis;
            }
        }

        long l = sum[index];
        long r = sum[n] - sum[index];
        long dis = Math.abs(l-r);
        System.out.println(dis);
    }
}