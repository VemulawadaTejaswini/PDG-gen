import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        Arrays.sort(a);
        long ans = 0;
        for (int i = 0; a[2] * i <= n; i++) {
            for (int j = 0; a[2] * i + a[1] * j <= n; j++) {
                long sum = a[2] * i + a[1] * j;
                if ((n - sum) % a[0] == 0) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}