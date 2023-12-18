import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();

        double y = x*x*Math.PI;
        double z = 2*x*Math.PI;

        System.out.printf("%f %f\n",y,z);
    }
}
