import java.util.*;
import java.text.DecimalFormat;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.000000");
        double r = input.nextDouble();
        double p = Math.PI;
        double s = r*r*p;
        double c = 2*r*p;
        String ss = df.format(s);
        String cc = df.format(c);
        System.out.println(ss + " " + cc);
    }
}
