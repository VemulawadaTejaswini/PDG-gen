import java.util.Scanner;

public class Main{
   
    
    public static void main(String[] args){
        int n;
        int[] R;
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        R = new int[n];
  
        for( int i = 0; i < n; i++) R[i] = sc.nextInt();
        
        int a = 1;
        
    for ( int i = 1; i < n; i++){
        int m = 100000000;
        if ( R[i] < m);
       
            if (R[j] < m ) m = R[j];
        }
        if ( R[i] - m > a ) a = R[i] - m;
    }
    System.out.println(a);
  
    }
}