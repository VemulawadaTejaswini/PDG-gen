import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.StrictMath.floor;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = sc.nextInt();
        int d = sc.nextInt();

        int[][] arr = new int[n][d];

        for(int i=0; i<n; i++) {
            for(int j = 0; j<d; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int res = 0;
        for(int i = 0; i < n; i++) {

            for(int j = i + 1; j < n; j++) {
                double dis = 0;
                for (int k = 0; k<d; k++) {
                    dis += (arr[i][k] - arr[j][k]) * (arr[i][k] - arr[j][k]);
                }
                dis = Math.sqrt(dis);
                double temp = floor(dis);
                if ( temp - dis == 0) {
                    res++;
                }

            }
        }
        System.out.println(res);
    }
}
