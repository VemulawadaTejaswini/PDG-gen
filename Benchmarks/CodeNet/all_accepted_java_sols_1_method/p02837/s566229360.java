import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] x = new int[n][n];
        int[][] y = new int[n][n];

        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            Arrays.fill(x[i], -1);
            for(int j=0; j<a; j++) {
                x[i][j] = sc.nextInt() - 1;
                y[i][j] = sc.nextInt();
            }
        }
        int res = 0;
        A: for(int i=0; i<(1<<n); i++) {
            int c = Integer.bitCount(i);
            boolean[] b = new boolean[n];
            for(int j=0; j<n; j++) {
                b[j] = ((i>>j)%2) == 1;
            }
            for(int j=0; j<n; j++) {
                if(!b[j]) continue;
                for(int k=0; k<n; k++) {
                    if(x[j][k] == -1) continue;
                    if(y[j][k] == 1 && !b[x[j][k]]) continue A;
                    if(y[j][k] == 0 && b[x[j][k]]) continue A;
                }
            }
            res = Math.max(res, c);
        }
        System.out.println(res);


    }

}
