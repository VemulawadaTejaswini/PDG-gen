import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();

        int A[][] = new int[n][m];
        int B[][] = new int[m][l];
        long cnt = 0;
        int ai = 0, bi = 0, abj = 0, x = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int num = sc.nextInt();
                A[i][j] = num;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < l; j++) {
                int num = sc.nextInt();
                B[i][j] = num;
            }
        }
        while (x < n * l) {
            cnt += A[ai][abj] * B[abj][bi];
            if (abj + 1 == m) {
                System.out.print(cnt);
                x++;
                if (x % l != 0) {
                    System.out.print(" ");
                } else {
                    System.out.println("");
                }
                cnt = 0;
                abj = 0;
                if (bi < l - 1) {
                    bi++;
                } else {
                    bi = 0;
                    if (ai < n - 1) {
                        ai++;
                    }
                }
            }else{
                abj++;
            }
        }
    }
}