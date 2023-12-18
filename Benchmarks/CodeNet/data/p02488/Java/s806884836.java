import java.util.*;


public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.parseInt(scanner.next());
        String minString = "zzzzzzzzzzzzzzzzzzzzz";
        
        for ( int i = 0; i < number; i++ ) {
            String word = scanner.next();
            if ( word.compareTo(minString) <= 0 ) {
                minString = word;
            }
        }
        System.out.println(minString);
    }
}