import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int ans = 0;
        int[] a = new int[m];
        for (int i = 0; i < n; i++) {
            int sum = c;
            for (int j = 0; j < m; j++) {
                a[j] = sc.nextInt();
                int tmp = a[j] * b[j];
                sum += tmp;
            }
            if (sum > 0) {
                ans++;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}