import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int l = scanner.nextInt();
        long[][] A = new long[(n)][(m)];
        long[][] B = new long[(m)][(l)];
        long[][] C = new long[(n)][(l)];

        for (int i = 0; n > i; i++) {
            for (int j = 0; m > j; j++) {
                int a = scanner.nextInt();
                A[i][j] = a;
            }
        }

        for (int i = 0; m > i; i++) {
            for (int j = 0; l > j; j++) {
                int a = scanner.nextInt();
                B[i][j] = a;
            }
        }

        for (int i = 0; n > i; i++) {
            for (int j = 0; m > j; j++) {
                for (int k = 0; l > k; k++) {
                    C[i][k] += A[i][j] * B[j][k];
                }
            }
        }

            for (int i = 0; n > i; i++) {
                for (int j = 0; l > j; j++) {
                    if (j != (l-1)) {
                        System.out.print(C[i][j]+" ");
                    } else {
                        System.out.println(C[i][j]);
                    }
                }
            }
        }
    }