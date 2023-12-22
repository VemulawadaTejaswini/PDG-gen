import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int tmp = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (tmp == a[i]) {
                cnt++;
            } else {
                tmp = a[i];
            }
        }
        long ans = n - ((cnt + 1) / 2) * 2;
        System.out.println(ans);
        sc.close();
    }
}
