import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        System.out.printf("%.8f%n", Math.hypot(scan.nextDouble()-x, scan.nextDouble()-y));
    }
}