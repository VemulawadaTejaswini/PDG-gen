import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt(), m = in.nextInt();
        int[][] M = new int[n][m];
        int[] V = new int[m];

        //input
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)M[i][j]=Integer.parseInt(in.next());
        }

        for(int i = 0; i < m; i++) V[i] = Integer.parseInt(in.next());

        //solve and output
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 0; j < m; j++)sum += M[i][j] * V[j];
            System.out.println(sum);
        }
    }
}
