import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        final double PI = 3.14159275;
     	int r = sc.nextInt();
		
     	double A = PI*Math.pow(r, 2);
		double P = 2*PI*r;
		
		System.out.printf("%5.5f %5.5f",A,P);
     	
	sc.close();
	}


}