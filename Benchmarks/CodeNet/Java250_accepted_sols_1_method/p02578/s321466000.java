import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        long ans = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, a[i]);
            ans += max - a[i];
        }
        System.out.println(ans);
    }
}