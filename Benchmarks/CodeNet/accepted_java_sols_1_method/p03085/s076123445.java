import java.util.*;
import java.awt.*;
import java.awt.geom.Point2D;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[]$){
        Scanner sc = new Scanner(in);
        String s=sc.next();
        char a=s.charAt(0);
        if(a=='A')out.println("T");
        if(a=='T')out.println("A");
        if(a=='G')out.println("C");
        if(a=='C')out.println("G");
    }
}