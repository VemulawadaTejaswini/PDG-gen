import java.util.Scanner;
public class Main{    
    public static void trace ( int n,int []A){
        for ( int j = 0; j < n; j++){
            if ( j > 0 ) System.out.print(" ");
            System.out.print(A[j]);
        }
            System.out.print("\n");
    }
                             
                            
     public static void main(String[] args){
        int n;
        int[] A;
                    
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        A = new int[n];
        
        for ( int j = 0; j < n; j++ ) A[j] = sc.nextInt();
         //bubble sort
        int k=0;
        int tmp=0;
        boolean flag = true;
        while (flag){
            flag = false;
            for ( int j = n-1;j > 0; j--){
                if ( A[j] < A[j-1] ) {
                    tmp    = A[j-1];
                    A[j-1] = A[j];
                    A[j]   = tmp; 
                    k++;
                    flag = true;
                }
            }
        }
         trace(n,A);
         System.out.println(k);
    }
}