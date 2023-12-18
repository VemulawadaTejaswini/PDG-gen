import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private int n;
    private int[] a;

    private void run() {
        n = sc.nextInt();
        a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == n - 1 && j == n - 1) || a[i] < a[j]) {
                    ans++;
                    break;
                }
                if (i != j && a[i] % a[j] == 0) {
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
