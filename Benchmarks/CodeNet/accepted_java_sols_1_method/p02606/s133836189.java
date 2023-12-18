import java.util.* ;
public class Main {
    public static void main(String[] args) {
        Main obj = new Main() ;
        Scanner S = new Scanner( System.in ) ;
        int l = S.nextInt() ;
        int r = S.nextInt() ;
        int k = S.nextInt() ;
        int result = 0 ;
        for( int i=l;i<=r;i++ ) {
            if( i%k==0 ) result++ ;
        }
        System.out.println( result ) ;
    }
}