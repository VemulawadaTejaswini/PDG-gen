import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] a = new int[n][d];

        for(int i = 0; i<n; i++) {
            for(int j = 0; j<d; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        long cnt = 0;
        for(int i = 0; i<n; i++) {
            for(int j = i+1; j<n; j++) {
                double x = 0;
                for(int k = 0; k<d; k++) {
                    x += Math.pow(a[i][k] - a[j][k],2);
                }
                x = Math.sqrt(x);
                if((x-(long)(x)) == 0) cnt++;
            }
        }


        System.out.println(cnt);
    }
}