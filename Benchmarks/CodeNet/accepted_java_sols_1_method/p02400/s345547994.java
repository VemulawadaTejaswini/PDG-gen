import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = Math.PI;
        double r = sc.nextDouble();
        
        double m=r*r*x;
        double n=r*2*x;
        
        System.out.printf("%.6f %.6f\n",m,n);
	sc.close();
    }
}
