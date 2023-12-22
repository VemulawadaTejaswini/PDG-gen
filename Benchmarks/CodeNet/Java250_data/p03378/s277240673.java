import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int[] A = new int[M];
        int sum = 0;
        int sumr = 0;
        for(int i = 0; i < M; i++){
            A[i] = sc.nextInt();
            sum++;
            if(A[i] < X)
                sumr++;
        }
        sc.close();
        System.out.println(Math.min(sum-sumr, sumr));
   }
}