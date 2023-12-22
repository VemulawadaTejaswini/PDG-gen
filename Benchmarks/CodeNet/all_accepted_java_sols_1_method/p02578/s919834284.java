import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        

        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i =0; i < n; i++){
            A[i] = sc.nextInt();
        }
         

         int[] help = new int[n];
         help[0] = A[0];
         for(int i = 1; i < n; i++){
            if(A[i-1] >= A[i] )
               help[i] = help[i-1];

            else if(A[i] > A[i-1] && A[i] > help[i-1])
               help[i] = A[i];
             else if(A[i] > A[i-1] && A[i] < help[i-1])
               help[i] = help[i-1];
         }
         long minH = 0L;
         for(int j = 0; j < n; j++){
             minH += Math.abs(A[j] - help[j]);
         }
         System.out.println(minH);
    }
}