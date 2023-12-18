import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        
        int a[][] = new int[N][N];
        
        for (int i = 0; i < N; i++){
            int idx = in.nextInt();
            int j = in.nextInt();
                for (int k = 0; k < j; k++){
                    int temp1 = in.nextInt();  
                    a[idx-1][temp1-1] = 1; 
                }
        }
        
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if (j != N-1){
                    System.out.print(a[i][j] + " ");
                }else{
                    System.out.println(a[i][j]);
                }
            }
        }

    }
    
}