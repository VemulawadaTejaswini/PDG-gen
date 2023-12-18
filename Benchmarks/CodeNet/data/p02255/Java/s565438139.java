import java.util.Scanner;
public class Main{
    public static void trace(int n,int []A){
       for ( int i = 0; i < n; i++ ){
            if ( i > 0 ) System.out.print(" ");
            System.out.print(A[i]);
       }
            System.out.print("\n");
    }

        public static void main(String[] args){
             int n;
             int[] A;
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        A = new int[n];
        
        for ( int i = 0; i < n; i++ ) A[i] = sc.nextInt();
        
        trace(n,A);
        
        
         //insertion sort
                
        for ( int i = 1; i < n; i++ ) {
                int key = A[i];
                int j = i - 1;
            while ( j >= 0 && A[j] > key ){
                A[j+1] = A[j];
                j--;
            }
                A[j+1] = key;
            trace(n,A);
         }
        }
}