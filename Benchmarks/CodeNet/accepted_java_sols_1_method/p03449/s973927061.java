import java.util.*;
 
public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
       int N = sc.nextInt();
       int[][] A = new int[2][N];
       int[] ue = new int[N];
       int[] shita = new int[N];
       for(int i = 0; i < 2; i++){
           for(int j = 0; j < N; j++){
               A[i][j] = sc.nextInt();
               if(i == 0){
                   if(j==0){
                       ue[j] = A[i][j];
                   } else {
                       ue[j] = ue[j-1] + A[i][j];
                   }
               }
               if(i == 1){
                    if(j==0){
                        shita[j] = A[i][j];
                    } else {
                        shita[j] = shita[j-1] + A[i][j];
                    }
               }
           }
       }
       sc.close();
      
       int max = 0;
       for(int i = 0; i < N; i++){
            if(i != 0)
                max = Math.max(max, ue[i] + (shita[N-1] - shita[i-1]));
            else
                max = Math.max(max, ue[i] + (shita[N-1]));
       }
       System.out.println(max);
    }
}