
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int[] p = new int[n];
        int ans = 0;
        int ab = 100;
        for (int i = 0 ; i < n ; i++) {
            p[i] = sc.nextInt();
        }
        for (int i = -100 ; i <= 101 ; i++) {
            boolean flg = true;
            for (int j = 0 ; j < n ; j++) {
                if (i == p[j]) {
                    flg = false;
                }
            }

            if (flg) {
                if (Math.abs(i - x) < ab) {
                    ans = i;
                    ab = Math.abs(i - x);
                }
            }
        }
        System.out.println(ans);
    }

}
