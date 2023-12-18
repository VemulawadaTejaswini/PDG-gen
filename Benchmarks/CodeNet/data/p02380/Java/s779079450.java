import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble()*(Math.PI/180);
        
        double s =(a*b*Math.sin(c))/2;
        double l = Math.sqrt(a*a + b*b -2*a*b*Math.cos(c))+a+b;
        double h = (2*s)/a;
        
        System.out.printf("%f\n%f\n%f\n",s,l,h);
    }
}
