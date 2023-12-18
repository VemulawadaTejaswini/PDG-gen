import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p[] = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 1; i < n - 1; i++) {
            int a = p[i - 1];
            int b = p[i];
            int c = p[i + 1];
            if (a < b) {
                if (b <= c) {
                    ans++;
                }
            }
            if (c < b) {
                if (b <= a) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
