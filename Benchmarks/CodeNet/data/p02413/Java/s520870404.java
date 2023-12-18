import java.util.*;
import java.lang.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] val = new int[r][c];
        int[] rsum = new int[r + 1];
        int[] csum = new int[c];
        int ans = 0;
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                val[i][j] = sc.nextInt();
                rsum[i] += val[i][j];
                rsum[r] += val[i][j];
            }
        }
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++) {
                csum[j] += val[i][j];
            }
        }
        
        
        for (int i = 0; i < r + 1; i++) {
            for (int j = 0; j < c; j++) {
                if (i < r) {
                    System.out.print(val[i][j] + " ");
                } else {
                    System.out.print(csum[j] + " ");
                }
            }
            System.out.println(rsum[i]);
        }
    }
}

