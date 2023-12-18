
import java.util.Scanner;

public class Main {

    private static final int MAX_N = 44;
    private static int[] d = new int[MAX_N+1];

    private static int q;
    private static String stringA;
    private static String stringB;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            stringA = scanner.next();
            stringB = scanner.next();

            System.out.println(lcs(stringA, stringB));
        }

    }

    private static int lcs(String X, String Y) {

        int m = X.length();
        int n = Y.length();

        X = " " + X;
        Y = " " + Y;

        int[][] d = new int[m+1][n+1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <=n; j++) {
                if(X.charAt(i) == Y.charAt(j)){
                    d[i][j] = d[i-1][j-1] + 1;
                }
                else {
                    d[i][j] = Math.max(d[i-1][j], d[i][j-1]);
                }
            }
        }

        return d[m][n];
    }


}