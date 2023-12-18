import java.util.Scanner;
 
public class Main{
 
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        System.out.printf("%.8f %.8f %.8f%n",
        		a * b * Math.sin(Math.toRadians(c)) / 2,
        		a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(c))),
        		b * Math.sin(Math.toRadians(c)));
    }
}