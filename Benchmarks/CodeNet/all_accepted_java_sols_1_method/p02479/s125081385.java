import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        Scanner input=new Scanner(System.in);
        double r=input.nextDouble();
        System.out.printf("%f %f\n",Math.PI*Math.pow(r,2),Math.PI*2*r);
    }
}