import java.util.* ;
public class Main{
       public static void main( String args[] ){
             Scanner cin = new Scanner( System.in ) ;
             int h = cin.nextInt() ;
             int w = cin.nextInt() ;
             int a[][] = new int[510][510] ;
             for( int i = 1 ; i <= h ; i++ )
                 for( int j = 1 ; j <= w ; j++ )
                     a[i][j] = cin.nextInt() ;
             int cnt = 0 ;
             int x1[] = new int[250010] ;
             int y1[] = new int[250010] ;
             int x2[] = new int[250010] ;
             int y2[] = new int[250010] ;
             for( int i = 1 ; i <= h ; i++ )
                 for( int j = 1 ; j <= w ; j++ ){
                     if ( j < w ){
                         if ( a[i][j] % 2 == 1 ){
                             cnt++ ; 
                             x1[cnt] = i ; y1[cnt] = j ;
                             a[i][j]-- ;
                             a[i][j + 1]++ ;
                             x2[cnt] = i ; y2[cnt] = j + 1 ;
                         }
                     }
                     else{
                         if ( i != h ){
                             if ( a[i][j]  % 2 == 1 ){
                                 cnt++ ;
                                 x1[cnt] = i ; y1[cnt] = j ;
                                 a[i][j]-- ;
                                 a[i + 1][j]++ ;
                                 x2[cnt] = i + 1 ; y2[cnt] = j ;
                             }
                         }
                     }
                 }
            System.out.println( cnt ) ;
            for( int i = 1 ; i <= cnt ; i++ )
                System.out.println( x1[i] + " " + y1[i] + " " + x2[i] + " " + y2[i] ) ;
       }
} 