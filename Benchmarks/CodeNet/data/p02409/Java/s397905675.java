import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int b[] = new int[n];
            int f[] = new int[n];
            int r[] = new int[n];
            int v[] = new int[n];
            int num[][][] = new int[4][3][10];

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
                f[i] = sc.nextInt();
                r[i] = sc.nextInt();
                v[i] = sc.nextInt();
                num[b[i]-1][f[i]-1][r[i]-1] += v[i];
            }
            for (int k = 0; k < 4; k++){
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 10; j ++) {
                        System.out.printf(" %d",num[k][i][j]);
                    }
                    System.out.println();
                }
                if (k == 3) break;
                System.out.printf("####################\n");
            }
        }
    }
}
