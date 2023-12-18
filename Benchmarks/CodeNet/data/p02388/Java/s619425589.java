import static java.lang.System.out;
import java.util.Scanner;
  
public class Main {
    public void main( String... args) {
        String x = new Scanner( System.in).nextLine();
        int input = Integer.parseInt( x);
        out.println( x * x * x);
    }
  
    int power( int num, int index) {
        if ( index == 0) {
            return 1;
        }
        if ( index < 2) {
            return num;
        }
        return num * power( num, index -1);
    }
}