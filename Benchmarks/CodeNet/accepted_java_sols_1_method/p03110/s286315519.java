import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        double sum=0;
        for (int i = 0; i < n; i++) {
            double x=sc.nextDouble();
            char c=sc.next().charAt(0);
            if(c=='J'){
                sum+=x;
            }else {
                sum+=(x*380000.0);
            }
        }
        out.println(sum);
    }
}