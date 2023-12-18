import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), k = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= k) ++cnt;
        }

        System.out.println(cnt);
    }
}
