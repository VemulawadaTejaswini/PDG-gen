import java.util.*;
public class Main {
	 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d, tptn = 0;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] p = new int[n];
        int[][] pattern = new int[n][6];
        for(int i = 0; i < k; i++) {
            d = sc.nextInt();
            p[d-1] = sc.nextInt();
            }
        if(p[0] == 0) {
            for(int i = 0; i < 3; i++) pattern[0][i] = 1;
        }
        else pattern[0][p[0]-1] = 1;
         
        for(int i= 1; i < n; i++) {
            for(int h = 0; h < 6; h++) tptn += pattern[i-1][h]%10000;
 
                if(p[i] == 0) {
                    for(int j = 0; j < 6; j++) {
                    if(j<3) pattern[i][j] = (tptn-pattern[i-1][j]-pattern[i-1][j+3])%10000;
                    else pattern[i][j] = pattern[i-1][j-3];
                    }
                }
                    else {
                        pattern[i][p[i]-1] = (tptn-pattern[i-1][p[i]-1]-pattern[i-1][p[i]+2])%10000;
                        pattern[i][p[i]+2] = pattern[i-1][p[i]-1];
                 
                }
                tptn = 0;
                if(i == n - 1) for(int h = 0; h < 6; h++) tptn += pattern[n-1][h]%10000;
        }
        System.out.println(tptn % 10000);
    }
}