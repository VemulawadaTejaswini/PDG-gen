import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        char b = sc.next().charAt(0);
        char ans = 'x';
        if ( b == 'A' ) ans = 'T';
        if ( b == 'C' ) ans = 'G';        
        if ( b == 'G' ) ans = 'C';                
        if ( b == 'T' ) ans = 'A';
        System.out.println(ans);
    }
}
