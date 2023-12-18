
import java.util.Scanner;

class Main{

public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int i;
        
        int Min = 1000000;
        int Max = -1000000;
        long Sum = 0; 
        
        for(i=0; i<n; i++){
        int a = scan.nextInt();
        
        if( a < Min ){
            Min = a;
        }
        
        if( a > Max ){
            Max = a;
        }
        
            Sum += a;
            
        }
        
        
        
        
        System.out.println(Min+" "+Max +" "+ Sum );
       
        
}
}
        
        
       
       
        
    







