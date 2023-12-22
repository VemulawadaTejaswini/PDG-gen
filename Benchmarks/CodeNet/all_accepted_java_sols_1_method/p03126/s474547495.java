import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                int tmp = sc.nextInt();
                a[tmp - 1]++;
            }
        }
        sc.close();

        int ans = 0;
        for (int i = 0; i < m; i++) {
            if (a[i] == n) {
                ans++;
            }
        }
        System.out.println(ans);
    }

}
