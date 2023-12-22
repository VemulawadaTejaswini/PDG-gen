import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        double a = Double.parseDouble(s.next());
        double b = Double.parseDouble(s.next());
        double n = Double.parseDouble(s.next());
          
        double base = Math.floor(n/b); 
        double as = Math.floor(a*n/b);

        int iBase = (int)base;

        if (iBase == 0) System.out.println((int)(Math.floor(as - a*base)));
        else if (iBase == 1) {
            int result = (int)(Math.floor(as - a*base));
            n = b-1;
            base = Math.floor(n/b); 
            as = Math.floor(a*n/b);
            int resultb = (int) (Math.floor(as - a*base));

            System.out.println(Math.max(result, resultb));
        } else {
            int result = (int)(Math.floor(as - a*base));
            if (iBase - 1 == 0) {
                n = b*iBase - 1;
                base = Math.floor(n/b); 
                as = Math.floor(a*n/b);
                int resultb = (int) (Math.floor(as - a*base));

                result = Math.max(result, resultb);
            }
            System.out.println(result);
        }
    }
}