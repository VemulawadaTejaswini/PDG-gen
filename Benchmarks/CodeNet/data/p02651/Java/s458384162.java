import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] ans = new int[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = (int) (sc.nextLong() % 2);
            }
            String s = sc.next();

            int x = 0;
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == '1') {
                    if (a[j] != x) x = 1;
                } else {
                    if (a[j] == x) x = 0;
                }
            }

            ans[i] = x;
        }

        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
}
