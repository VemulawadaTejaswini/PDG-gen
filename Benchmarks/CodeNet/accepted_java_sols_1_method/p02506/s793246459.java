import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String target = (scanner.next()).toLowerCase();
        int result = 0;
        String word = "";
        
        while ( true ) {
            word = scanner.next();
            if ( word.equals("END_OF_TEXT") ) {
                break;
            }
            word = word.toLowerCase();
            if ( word.equals(target) ) {
                result++;
            }
        }
        System.out.println(result);
    }
}