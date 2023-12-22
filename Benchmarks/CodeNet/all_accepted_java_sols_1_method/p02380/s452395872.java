import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
 
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double angle = scan.nextDouble();

        double rad = angle * (Math.PI / 180);
        double x = (a - (b * Math.cos(rad)));
        double h = b * Math.sin(rad);
        double c = Math.sqrt((h * h) + (x * x));
        double S = (a * h) /2;
        double L = a + b + c;

        System.out.println(S);
        System.out.println(L);
        System.out.println(h);
    }
}

