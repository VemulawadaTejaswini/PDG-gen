import static java.lang.Integer.parseInt;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int w = 0;
        do {
            w = inputLine();
            list.add(w);
        } while (w != 0);
        
        for ( int q = 0 ; q < list.size()-1 ; q++ ) {
            System.out.println ("Case " + q + ": " + list.get(q));
        }
        
    }
    public static int inputLine() {
        String line = new java.util.Scanner(System.in).nextLine();
        return parseInt(line);
    }
}