import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[][] b = new int[n][n];
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                b[i][j] = -1;
            }
        }
        for (int i = 0 ; i < n; i++) {
            a[i] = sc.nextInt();
            for (int j = 0 ; j < a[i] ; j++) {
                int x = sc.nextInt() - 1;
                int y = sc.nextInt();
                b[i][x] = y;
            }
        }
        int c = 0;
        for (int i = 0 ; i < Math.pow(2, n) ; i++) {
            int[] d = new int[n];
            for (int j = 0 ; j < n ; j++) {
                if ((1 & i >> j) == 1) {
                    d[j] = 1;
                }
            }
            //正直ものとかていして、矛盾が生じないか確認する。
            boolean flg = true;
            for (int j = 0 ; j < n ; j++) {
                for (int k = 0 ; k < n ; k++) {
                    if (b[j][k] != -1) {
                        if (d[j] == 1) {
                            if (b[j][k] != d[k]) {
                                flg = false;
                            }
                        }
                    }
                }
            }
            int e = 0;
            if (flg) {
                for (int j = 0 ; j < n ; j++) {
                    e += d[j];
                }
            }
            c = Math.max(c, e);

  //          System.out.println(d[0] + " " + d[1] + " " + d[2]);
        }


        System.out.println(c);

    }

}