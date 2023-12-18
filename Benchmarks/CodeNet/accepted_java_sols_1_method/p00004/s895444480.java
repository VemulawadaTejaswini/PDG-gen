import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            double a = input.nextInt();
            double b = input.nextInt();
            double c = input.nextInt();
            
            double d = input.nextInt();
            double e = input.nextInt();
            double f = input.nextInt();
            
            e -= b * (d / a);
            f -= c * (d / a);
            double y = f / e;
            
            b *= y;
            c -= b;
            double x = c / a;
            System.out.println(String.format("%.3f %.3f", x, y));
        }
    }
}