import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextLong();
        }
        long max = a[0];
        long ans = 0l;
        for (int i = 1; i < a.length; i++) {
            if(a[i] <= max) {
                ans += max - a[i];
            } else {
                max = a[i];
            }
        }
        System.out.println(ans);
    }
}