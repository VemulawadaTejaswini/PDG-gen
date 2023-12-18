// "static void main" must be defined in a public class.
import java.util.* ;
public class Main {
    
    public static void main(String[] args) {
        Scanner S = new Scanner( System.in ) ;
        Main obj = new Main() ;
        int n = S.nextInt() ;
        long[] arr = new long[n] ;
        int terms = S.nextInt() ;
        for( int i=0;i<n;i++ ) arr[i] = S.nextLong() ;
        
        long pre = 0 ;
        boolean flag = true ;
        for( int i=0;i<=arr.length-terms;i++ ) {
            long sum = 1 ;
            for( int index=i,j=0;j<terms;j++,index++ ) {
                sum *= arr[index] ;
            }
            if( !flag ){
                if( pre<sum ) 
                    System.out.println( "Yes" ) ;
                else 
                    System.out.println( "No" ) ;
            }
            flag = false ;
            pre = sum ;
        }
    
     }
    
}




