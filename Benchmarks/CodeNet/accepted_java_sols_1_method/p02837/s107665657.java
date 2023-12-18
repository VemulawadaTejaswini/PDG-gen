import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int NONE = -1;
        final int HONEST = 1;
        final int UNKIND = 0;

        Scanner sc = new Scanner(System.in);
        try {
            final int n = sc.nextInt();
            int [][] shogen = new int[n][n];
            for (int i=0; i<n; i++) {
                for (int j=0; j<n; j++) {
                    shogen[i][j] = NONE;
                }
            }
            for (int i=0; i<n; i++) {
                int m = sc.nextInt();
                for (int j=0; j<m; j++) {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    shogen[i][x-1] = y;
                }
            }

            int maxCount = 0;
            int n2 = 1 << n;
            for (int i=1; i<n2; i++) {
                int [] assumption = new int[n];
                int tmp = i;
                for (int j=0; tmp != 0; j++) {
                    if (tmp % 2 == 1) {
                        assumption[j] = HONEST;
                    } else {
                        assumption[j] = UNKIND;
                    }
                    tmp >>= 1;
                }

                boolean ok = true;
                for (int j=0; j<n; j++) {
                    if (assumption[j] == HONEST) {
                        for (int k=0; k<shogen[j].length; k++) {
                            if ((shogen[j][k] == HONEST && assumption[k] == UNKIND)
                                    || (shogen[j][k] == UNKIND && assumption[k] == HONEST)) {
                                ok = false;
                            }
                        }
                    }
                }
                if (ok) {
                    maxCount = Math.max(maxCount,  Integer.bitCount(i));
                }
            }

            System.out.println(maxCount);

        } finally {
            sc.close();
        }
    }
}

