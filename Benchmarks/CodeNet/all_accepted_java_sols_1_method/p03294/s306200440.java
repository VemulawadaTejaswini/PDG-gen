import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += a[i] - 1;
        }

        System.out.println(ans);
    }
}