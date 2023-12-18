import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double  r=sc.nextDouble();
        System.out.printf("%f.5 %f.5%n",
        r*r*Math.PI,2*r*Math.PI);
    }
}
