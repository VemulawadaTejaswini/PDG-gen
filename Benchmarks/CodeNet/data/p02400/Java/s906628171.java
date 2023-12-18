import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double PI = 3.1416;
     	double r = sc.nextDouble();

	System.out.println(PI*r*r+" "+2*PI*r);
     	
	sc.close();
	}
}