import java.util.Scanner;

public class Main{
	public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        double x=Math.PI;
        double r = sc.nextDouble();
        System.out.println(String.format("%.6f",r*r*x));
        System.out.println(String.format("%.6f",2*r*x));
   }
}
