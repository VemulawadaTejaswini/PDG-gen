import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] l = new int[m];
        int[] r = new int[m];
        for (int i = 0; i < m; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        int L = 0;
        int R = n;
        for (int i = 0; i < m; i++) {
            L = Math.max(L, l[i]);
            R = Math.min(R, r[i]);
        }
        if (L <= R) {
            System.out.println(R - L + 1);
        } else {
            System.out.println(0);
        }

    }

}