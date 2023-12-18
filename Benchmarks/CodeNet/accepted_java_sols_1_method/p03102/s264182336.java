import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), c = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int a = 0;
            for (int j = 0; j < m; j++) {
                a += sc.nextInt() * b[j];
            } if (a + c > 0) ans += 1;
        }

        System.out.println(ans);

    }
}
