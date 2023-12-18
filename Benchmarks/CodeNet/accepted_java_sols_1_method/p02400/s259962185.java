import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double r,a,b;
        r = sc.nextDouble();
        a = (r * r * Math.PI);
        b = (2 * r * Math.PI);
        System.out.printf("%.6f %.6f", a, b);
    }
}
