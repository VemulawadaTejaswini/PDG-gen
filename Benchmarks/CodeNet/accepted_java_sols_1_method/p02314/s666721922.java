import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt(), c[] = new int[n], a[] = new int[m + 1];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        Arrays.fill(a, Integer.MAX_VALUE);
        a[0] = 0;
                for (int i = 0; i < n; i++)
                    for (int j = c[i]; j <= m; j++) {
                        a[j] = Math.min(a[j], a[j - c[i]] + 1);
                    }
        System.out.println(a[m]);
    }
}
