import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();

        int[][] d1 = new int[n][m];
        int[][] d2 = new int[m][l];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                d1[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<m; i++) {
            for(int j=0; j<l; j++) {
                d2[i][j] = sc.nextInt();
            }
        }

        long[][] ans = new long[n][l];
        for(int i=0; i<n; i++) {            // height
            for(int k=0; k<l; k++) {        // width
                for(int j=0; j<m; j++) {    // content
                    ans[i][k] += d1[i][j]*d2[j][k];
                }
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<l; j++) {
                if(j == l-1) {
                    System.out.println(ans[i][j]);
                } else {
                    System.out.print(ans[i][j] + " ");
                }
            }
        }
    }
}

