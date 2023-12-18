import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double a = (double)r*r*3.141592653589;
        double c = (double)(2*r)*3.141592653589;
        System.out.println(String.format("%.5f", a) + " " + String.format("%.5f", c));
    }
}
