import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble()*(Math.PI/180);
        double S,L,h;
        
        S = (a * b * Math.sin(c))/2;
        L = a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(c));
        h = (2 * S)/a;
        System.out.printf("%f\n%f\n%f\n",S,L,h);
    }
}
