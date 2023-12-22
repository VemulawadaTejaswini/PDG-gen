import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();

    int x = 0 ;
    int xMax = 0 ;
    for( int i = 0 ; i < N ; i ++){
      switch ( S.charAt( i ) ){
        case 'I':
        x ++ ;
        if( x > xMax ){
          xMax = x;
        }
        break;
        case 'D':
        x -- ;
        break;
      }
    }
    System.out.println( xMax );
  }
}
