import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double PI = 3.14159275;
     	double r = sc.nextDouble();
		
  		
        System.out.printf("%5.5f %5.5f\n",PI*r*r,2*PI*r);
     	
	sc.close();
	}
}