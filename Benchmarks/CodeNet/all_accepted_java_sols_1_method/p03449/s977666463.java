import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] A = new int[2][N];

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < N; j++){
                A[i][j] = in.nextInt();
            }
        }
        int max = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j <= i; j++){
                int sum = 0;    
                for(int k = 0;k < N; k++){
                    if (k <= j){
                        sum += A[0][k];
                        if(k == j){
                            sum += A[1][k];
                        }
                    } else{
                        sum += A[1][k];
                    }
                }
                if (sum > max){

                    max = sum;
                }
            }
        }
        System.out.println(max);
        
        in.close();
    }
}
