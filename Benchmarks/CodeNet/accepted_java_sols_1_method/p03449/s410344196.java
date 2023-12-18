import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[2][n];
        for(int i=0; i<2; i++) {
            for(int j=0; j<n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int res = 0;
        for(int x=0; x<n; x++) {
            int sum = 0;
            for(int i=0; i<=x; i++) {
                sum += a[0][i];
            }
            for(int i=x; i<n; i++) {
                sum += a[1][i];
            }
            res= Math.max(sum, res);
        }
        System.out.println(res);
    }

}
