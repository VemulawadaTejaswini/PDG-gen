import static java.lang.Math.acos;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double r=in.nextDouble();
        double pi=acos(-1.0);
        Double are=2*pi*r;
        System.out.printf("%.20f\n",are);
        
    }
}