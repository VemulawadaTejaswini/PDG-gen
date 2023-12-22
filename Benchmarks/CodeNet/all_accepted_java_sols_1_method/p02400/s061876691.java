import java.util.Scanner;
 public class Main{

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double r = sc.nextDouble();
        Double a;
        Double b;
        a=r*r*Math.PI;
        b=r*2*Math.PI;
        
        System.out.printf("%.6f ",a);
         System.out.printf("%.6f",b);
	}

 }
