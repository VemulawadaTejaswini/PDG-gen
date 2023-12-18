// "static void main" must be defined in a public class.
import java.util.* ;
public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner( System.in ) ;
        Main obj = new Main() ;
        int t = S.nextInt() ;
        if( 400<=t && t<=599 ) {
            System.out.println("8") ;
            return ;
        }
        if( 600<=t && t<=799 ) {
            System.out.println("7") ;
            return ;
        }
        if( 800<=t && t<=999 ) {
            System.out.println("6") ;
            return ;
        }if( 1000<=t && t<=1199 ) {
            System.out.println("5") ;
            return ;
        }if( 1200<=t && t<=1399 ) {
            System.out.println("4") ;
            return ;
        
        }
    if( 1400<=t && t<=1599 ) {
            System.out.println("3") ;
            return ;
    }
        if( 1600<=t && t<=1799 ) {
            System.out.println("2") ;
            return ;
        }if( 1800<=t && t<=1999 ) {
            System.out.println("1") ;
            return ;
        }
    }
}




