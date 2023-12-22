import java.util.Scanner;

 public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        double r = sc.nextDouble();
        double answer1 = 2.0*r*Math.PI;
        double answer2 = r*r*Math.PI;
        System.out.printf("%.6f %.6f",answer2,answer1);
        sc.close();
    }
}
