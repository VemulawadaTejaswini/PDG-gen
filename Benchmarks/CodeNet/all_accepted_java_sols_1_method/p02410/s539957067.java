import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] a = new int[n][m];
        int b[] = new int[m];
        int c[] = new int[n];
        Arrays.fill(c,0);

        for (int i = 0; i < n; i++) {
            for (int j=0; j < m; j++) {
                a[i][j] = scn.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            b[i] = scn.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[i]= c[i]+a[i][j]*b[j];
            }
            System.out.println(c[i]);
        }



        scn.close();

    }


}
