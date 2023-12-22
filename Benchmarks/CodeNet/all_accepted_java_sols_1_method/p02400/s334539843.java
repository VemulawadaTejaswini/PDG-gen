import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        double r = in.nextDouble();
        double pi = Math.PI;

        System.out.printf("%f %f\n", r*r*pi, 2*r*pi);
    }
}
