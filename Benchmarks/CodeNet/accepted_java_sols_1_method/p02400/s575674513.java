
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double x = Math.PI;
        double cir = 2 * r * x;
        double area = r * r * x;
        String a = String.format("%.5f", area);
        String b = String.format("%.5f", cir);
        System.out.println(a + " " + b);                
    }    
}

