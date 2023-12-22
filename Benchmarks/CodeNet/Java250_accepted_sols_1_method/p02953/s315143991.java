import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[] ary = new long[n];
        for (int i = 0; i < n; i++) {
            long a = Long.parseLong(sc.next());
            ary[i] = a;
        }
        boolean ans = true;
        for (int i = n - 1; i > 0; i--) {
            if (n == 1) {
                break;
            }
            if (ary[i - 1] > ary[i]) {
                ary[i - 1] = ary[i - 1] - 1;
            }
            if (ary[i - 1] > ary[i]) {
                break;
            }
        }
        for (int i = n - 1; i > 0; i--) {
            if (n == 1) {
                break;
            }
            if (ary[i - 1] > ary[i]) {
                ans = false;
                break;
            }
        }
        System.out.println(ans ? "Yes" : "No");
    }
}