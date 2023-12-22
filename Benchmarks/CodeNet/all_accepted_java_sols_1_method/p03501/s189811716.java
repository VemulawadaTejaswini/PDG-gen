import java.util.*;
import java.lang.*;
 
 //O(100000000)
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        long A = Long.parseLong(sc.next());
        long B = Long.parseLong(sc.next());
        
        long ans = N * A ;
        
        long a = Math.min( ans , B );
        
        System.out.print(a);
        System.out.println();
    }

}

