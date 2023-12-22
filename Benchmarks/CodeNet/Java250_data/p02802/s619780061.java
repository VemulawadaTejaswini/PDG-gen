import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC151C - Welcome to AtCoder

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] p = new int[m];
        String[] s = new String[m];

        int[] ac = new int[n];
        int[] wa = new int[n];

        int acCnt = 0;
        int waCnt = 0;

        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
            s[i] = sc.next();
            if (s[i].equals("AC")) {
                if (ac[p[i] - 1] == 0) {
                    acCnt++;
                    waCnt += wa[p[i] - 1];
                }
                ac[p[i] - 1]++;
            } else {
                if (ac[p[i] - 1] == 0) {
                    wa[p[i] - 1]++;
                }

            }
        }

        System.out.println(acCnt + " " + waCnt);
    }
}