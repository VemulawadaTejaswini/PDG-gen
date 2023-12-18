import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean[][] b = new boolean[m][n];

        for(int i=0; i<m; i++) {
            int k = sc.nextInt();
            for(int j=0; j<k; j++) {
                b[i][sc.nextInt()-1] = true;
            }
        }
        int[] p = new int[m];
        for(int i=0; i<m; i++) {
            p[i] = sc.nextInt();
        }

        int res = 0;
        A: for(int i=0; i<(1<<n); i++) {
            for(int j=0; j<m; j++) {
                int sum = 0;
                for(int l=0; l<n; l++) {
                    if(b[j][l] && (i>>l)%2 == 1) {
                        sum++;
                    }
                }
                if(sum % 2 != p[j]) continue A;
            }
            res++;
        }

        System.out.println(res);

    }

}
