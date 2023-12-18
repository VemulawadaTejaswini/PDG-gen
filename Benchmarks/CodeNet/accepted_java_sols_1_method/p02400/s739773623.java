import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.printf("%f %f\n",r*r*Math.PI,r*2*Math.PI);
    }
}
