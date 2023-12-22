import java.util.* ;
public class Main {
    public static void main(String[] args) {
        Main obj = new Main() ;
        Scanner S = new Scanner( System.in ) ;
        int result = 0 ;
        int n = S.nextInt() ;
        for( int i=1;i<=n;i++ ) {
            int num = S.nextInt() ;
            if( ( i==1 || i%2!=0 ) && num%2!=0 ) result++ ;
        }
        System.out.println( result ) ;
    }
}