import java.util.Scanner;

public class Main {

    static final long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // counter
        int[] c = new int[3];
        long ans = 1;

        for (int i = 0; i < n; i++) {
            int num = 0;
            boolean countUp = false;
            for (int j = 0; j < 3; j++) {
                if (a[i] == c[j]) {
                    num++;
                    if (!countUp) {
                        c[j]++;
                        countUp = true;
                    }
                }
            }
            ans = (ans * num) % mod;
        }

        System.out.println(ans);

        sc.close();
    }

}
