import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            a[i] = sc.nextInt();
        }

        long sum = 0;

        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            int buster = Math.min(a[i], b);
            int secondBuster = Math.min(a[i + 1], b - buster);
            a[i + 1] -= secondBuster;
            sum += buster + secondBuster;
        }

        System.out.println(sum);
    }
}
