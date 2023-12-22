import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        int cnt2 = 0;
        int cnt4 = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] % 4 == 0) {
                cnt4++;
                continue;
            }
            if (a[i] % 2 == 0) {
                cnt2++;
            }
        }
        if (cnt2 == 0 && cnt4 >= n / 2
                || cnt2 != 0 && cnt4 >= (n - cnt2 + 1) / 2) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

}
