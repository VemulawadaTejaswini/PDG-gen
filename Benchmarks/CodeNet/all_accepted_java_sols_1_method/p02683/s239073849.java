import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[] c = new int[n];
        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
            for(int j=0; j<m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int min = Integer.MAX_VALUE;

        for(int i=0; i<1<<n; i++) {
            int sum = 0;
            int[] r = new int[m];
            for(int j=0; j<n; j++) {
                if((i>>j)%2 == 1) {
                    sum += c[j];
                    for(int k=0; k<m; k++) {
                        r[k] += a[j][k];
                    }
                }
            }
            boolean ok = true;
            for(int k=0; k<m; k++) {
                if(r[k] < x) {
                    ok = false;
                    break;
                }
            }
            if(ok) {
                min = Math.min(min, sum);
           }

        }

        System.out.println(min<Integer.MAX_VALUE ? min : -1);
    }
}