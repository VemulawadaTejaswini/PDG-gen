import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double r;
       r = sc.nextDouble();
       double pi = Math.PI;
       System.out.printf(" %.5f %.5f",pi*Math.pow(r,2) ,2*pi*r);
    }
}
