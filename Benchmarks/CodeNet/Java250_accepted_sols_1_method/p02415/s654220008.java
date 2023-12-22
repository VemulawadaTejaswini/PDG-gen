import java.util.*;

public class Main {
    public static void main( String args[] ) {
        Scanner scan = new Scanner( System.in );
        char[] charaArray = scan.nextLine().toCharArray();
        scan.close();
        
        for( char chara: charaArray ) {
            char result;
            if( Character.isUpperCase(chara) ) {
                result = Character.toLowerCase(chara);
                
            } else {
                result = Character.toUpperCase(chara);
                
            }
            System.out.print( String.valueOf( result ) );
            
        }
        System.out.println();
        
        
        
    }
}