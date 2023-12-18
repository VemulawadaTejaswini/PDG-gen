import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        
        double S=r*r*Math.PI;
        double R=2*r*Math.PI;

		System.out.printf("%.6f %.6f",S,R);
		System.out.println();

	}

}

