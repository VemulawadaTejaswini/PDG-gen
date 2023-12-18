import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[n + 1];
        long[] d = new long[n + 1];
        d[0] = 1;
        a[0] = 1;
        for (int i = 1; i < a.length; i++) {
            a[i] = sc.nextLong();
            //d[i] = d[i - 1] + a[i] * a[i - 1];
            long tmp = 1;
            d[i] = d[i - 1] * a[i];
            if(i > k ) {
                d[i] = d[i] / a[i - k];
            }
            if(i > k) {
                if(d[i] > d[i - 1]) {
                    System.out.println("Yes");
                }
                else {
                    System.out.println("No");
                }
            }
        }
    }
}