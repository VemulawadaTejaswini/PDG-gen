import java.util.Scanner;
import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double area,circumference,r;
        double pi = Math.PI;
        r = sc.nextDouble();
        area = Math.pow(r,2) * pi;
        circumference = r*2 *pi;
        System.out.printf("%.10f %.10f\n",area,circumference);


    }
}
