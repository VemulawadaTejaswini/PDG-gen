// "static void main" must be defined in a public class.
import java.util.* ;
public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner( System.in ) ;
        Main obj = new Main() ;
        int t = S.nextInt() ;
        int min = Integer.MAX_VALUE ;
        int change = t%1000 ;
        System.out.println( Math.min( min , (change)  ) ) ;
    }
}
// "static void main" must be defined in a public class.
// import java.util.* ;
// public class Main {
//     public static void main(String[] args) {
//         Scanner S = new Scanner( System.in ) ;
//         Main obj = new Main() ;
//         int t = S.nextInt() ;
        
//     }
// }