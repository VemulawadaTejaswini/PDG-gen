import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[m];
        String[] s = new String[m];
        for (int i = 0 ; i < m ; i++) {
            p[i] = sc.nextInt() - 1;
            s[i] = sc.next();
        }
        int[][] a = new int[2][n];
        for (int i = 0 ; i < m ; i++) {
            if (s[i].equals("WA") && a[1][p[i]] == 0) {
                a[0][p[i]]++;
            }
            if (s[i].equals("AC") && a[1][p[i]] == 0) {
                a[1][p[i]]++;
            }
        }
        int ac = 0;
        int wa = 0;
        for (int i = 0 ; i < n ; i++) {
            ac += a[1][i];
            if (a[1][i] == 1) {
                wa += a[0][i];
            }

        }

        System.out.println(ac + " " + wa);
    }

}
