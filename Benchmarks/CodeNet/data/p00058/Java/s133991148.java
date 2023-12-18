
import java.util.*;
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            double x1 = Double.parseDouble(sc.next()),y1 = Double.parseDouble(sc.next());
            double x2 = Double.parseDouble(sc.next()),y2 = Double.parseDouble(sc.next());
            double x3 = Double.parseDouble(sc.next()),y3 = Double.parseDouble(sc.next());
            double x4 = Double.parseDouble(sc.next()),y4 = Double.parseDouble(sc.next());
            x2-=x1;
            y2-=y1;
            x4-=x3;
            y4-=y3;
            if(Math.abs(x2*x4+ y2*y4) <= 1.0e-10)System.out.println("YES");
            
            else System.out.println("NO");
            
        }
    }
}
     