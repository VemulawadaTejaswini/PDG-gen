import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double a = r*r*Math.PI;
        double b = r*2*Math.PI;
        System.out.printf("%.10f %.10f",a,b);
    }
}

