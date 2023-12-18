import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double PI = Math.PI;
     	double r = sc.nextDouble();
		
     	double A = PI*r*r;
		double P = 2*PI*r;
		
		System.out.println(A+" "+P);
     	
	sc.close();
	}
}