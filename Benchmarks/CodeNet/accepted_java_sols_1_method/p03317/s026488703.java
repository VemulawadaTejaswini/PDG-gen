import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(sc.next());
            a[i] = tmp;
        }
        int start = n - 1;
        int ans = 0;
        while (start > 0) {
            ans++;
            start -= k - 1;
        }
        System.out.println(ans);
    }
}