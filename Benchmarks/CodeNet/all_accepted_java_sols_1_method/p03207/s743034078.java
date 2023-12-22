import java.util.Scanner;
import java.lang.Math;
import java.lang.StringBuilder;
import java.util.regex.Pattern;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            int n = sc.nextInt();
            int[] A=new int[n];
            
        
            for(int i=0; i<n; i++){
                A[i] = sc.nextInt();
            }
            
            
            for(int j=0; j<A.length-1; j++){
                 for(int k=n-1; k>j; k--){
                     if(A[k] < A[k-1]){
                         int temp = A[k];
                         A[k] = A[k-1];
                         A[k-1] = temp;
                     }
                 }
             }
             
             A[n-1] /= 2;
             
             int sum=0;
             for(int p=0; p<n; p++){
                 sum += A[p];
             }
             
             System.out.println(sum);
    
        }
    }


