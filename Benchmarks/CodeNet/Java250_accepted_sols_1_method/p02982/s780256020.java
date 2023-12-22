import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int[][] X = new int[N+1][D+1];

        int c = 0;
        int m = 0 ;
        double sqrt = 0;

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= D; j++){
                X[i][j] = sc.nextInt();
            }
        }

        for(int i = 1; i <= N -1; i++){
           for(int j = i +1; j <= N; j++){
            //    if(i == j){
            //         break;
            //    }
               for(int k = 1; k <= D; k++){
                    m += (X[i][k]-X[j][k]) * (X[i][k]-X[j][k]);
               }  

                sqrt = Math.sqrt(m);
                if(sqrt == (int)sqrt){
                    c++;
                }
                
                m = 0;
            }
        }


        System.out.println(c);
        
    }

}