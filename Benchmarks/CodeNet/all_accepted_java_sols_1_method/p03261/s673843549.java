import java.util.* ;
public class Main{
       public static void main( String args[] ){
             Scanner cin = new Scanner( System.in ) ;
             int n = cin.nextInt() ;
             String s[] = new String[110] ;
             for( int i = 1 ; i <= n ; i++ )
                 s[i] = cin.next() ;
             Boolean flag = true ;
             for( int i = 1 ; i <= n - 1 ; i++ )
                 for( int j = i + 1 ; j <= n ; j++ )
                     if ( s[i].compareTo( s[j] ) == 0 ) flag = false ;
             for( int i = 1 ; i <= n - 1 ; i++ ){
                 int len = s[i].length() ;
                 if ( s[i].charAt( len - 1 ) != s[i + 1].charAt( 0 ) ) flag = false ;
             }
             if ( flag ) System.out.println( "Yes" ) ;
             else System.out.println( "No" ) ;
       }
} 