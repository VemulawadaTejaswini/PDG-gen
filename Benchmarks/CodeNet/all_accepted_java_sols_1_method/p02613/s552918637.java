// "static void main" must be defined in a public class.
import java.util.* ;
public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner( System.in ) ;
        Main obj = new Main() ;
        // AC, , , and 
        int t = S.nextInt() ;
        HashMap<String,Integer> map = new HashMap<>() ;
        map.put( "AC" , 0 ) ;
        map.put( "WA" , 0 ) ;
        map.put( "TLE" , 0 ) ;
        map.put( "RE" , 0 ) ;
        int  i = 0 ;
        while( i<=t ){
            i++ ;
            String s = S.nextLine() ;
            // System.out.println( s ) ;
            map.put( s , map.getOrDefault( s , 0 )+1 ) ;
        }
            // System.out.println( map ) ;
        System.out.println( "AC x "+map.get("AC") ) ;
        System.out.println( "WA x "+map.get("WA") ) ;
        System.out.println( "TLE x "+map.get("TLE") ) ;
        System.out.println( "RE x "+map.get("RE") ) ;
    }
}